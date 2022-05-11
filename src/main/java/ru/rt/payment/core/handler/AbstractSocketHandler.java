package ru.rt.payment.core.handler;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;
import ru.rt.payment.core.transport.Transport;

public abstract class AbstractSocketHandler<RQ extends Request, RS extends Response> implements SocketHandler {
//    private static Logger LOGGER;

    private final Transport<RQ, RS> transport;
    private final Socket socket;

    private InputStream inputStream;

    private OutputStream outputStream;

    protected AbstractSocketHandler(final Transport<RQ, RS> transport, final Socket socket) {
        this.transport = transport;
        this.socket = socket;
    }

    protected boolean interrupted() {
        return Thread.interrupted();
    }

    protected void setStreams() {
        try {
            setInputStream(socket.getInputStream());
            setOutputStream(socket.getOutputStream());
        } catch (EOFException | SocketException e) {
            System.out.println("Remote client connection closed: " + socket.getRemoteSocketAddress().toString() + ": " +
                e.getMessage());
        } catch (IOException e) {
            if (!socket.isClosed()) {
                throw new RuntimeException("IO Error: " + e.getMessage(), e);
            }
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException("Close socket failed: " + e.getMessage(), e);
            }
        }
    }

    @Override
    public InputStream getInputStream() {
        return this.inputStream;
    }

    private void setInputStream(final InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public OutputStream getOutputStream() {
        return outputStream;
    }

    private void setOutputStream(final OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    //    В зависимости от запроса распределяет на нужные компоненты, если GET-запрос, то на компонент с логикой GET
    protected abstract void handle();
}
