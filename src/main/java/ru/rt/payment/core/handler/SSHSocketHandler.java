package ru.rt.payment.core.handler;

import java.net.Socket;
import ru.rt.payment.core.transport.SSHTransport;
import ru.rt.payment.core.data.SSHRequest;
import ru.rt.payment.core.data.SSHResponse;

public class SSHSocketHandler<TR extends SSHTransport<SSHRequest, SSHResponse>>
    extends AbstractSocketHandler<SSHRequest, SSHResponse> {

    private HandleRequest<SSHRequest, SSHResponse> handleRequest;

    protected SSHSocketHandler(TR transport, Socket socket) {
        super(transport, socket);
    }

    @Override
    protected void handle() {
//        Has-A: на handleRequest передаем управление.

    }

    @Override
    public void run() {

    }
}
