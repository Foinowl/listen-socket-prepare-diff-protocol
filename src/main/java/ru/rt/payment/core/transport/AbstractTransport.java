package ru.rt.payment.core.transport;

import java.net.Socket;
import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.converter.RequestConverter;
import ru.rt.payment.core.data.Response;
import ru.rt.payment.core.data.converter.ResponseConverter;

public abstract class AbstractTransport<RQ extends Request, RS extends Response> implements Transport<RQ, RS> {

    private ResponseConverter<RQ> responseConverter;

    private RequestConverter<RS> requestConverter;

    private Socket socket;

    public AbstractTransport(ResponseConverter<RQ> responseConverter,
                             RequestConverter<RS> requestConverter) {
        this.responseConverter = responseConverter;
        this.requestConverter = requestConverter;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setResponseConverter(final ResponseConverter<RQ> responseConverter) {
        this.responseConverter = responseConverter;
    }

    public void setRequestConverter(final RequestConverter<RS> requestConverter) {
        this.requestConverter = requestConverter;
    }

    //    У каждого протокола есть разный интерфейс. Чтобы отправить по сети его нужно конвертировать, в байты.
//    Для конвертации request and response, так же можно написать сериализатор и десиализатор, чтобы удобней было конвертировать в байты.
    protected abstract void prepareRequest();

    protected abstract void prepareResponse();
}


