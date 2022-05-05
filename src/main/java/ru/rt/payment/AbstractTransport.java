package ru.rt.payment;

import java.net.Socket;

public abstract class AbstractTransport<RQ extends Request, RS extends Response> implements Transport<RQ, RS> {


    private Socket socket;

    public void setSocket(final Socket socket) {
        this.socket = socket;
    }

    //    У каждого протокола есть разный интерфейс. Чтобы отправить по сети его нужно конвертировать, в байты.
//    Для конвертации request and response, так же можно написать сериализатор и десиализатор, чтобы удобней было конвертировать в байты.
    protected abstract void prepareRequest();

    protected abstract void prepareResponse();
}


