package ru.rt.payment.core.transport;

import java.io.InputStream;
import ru.rt.payment.core.data.converter.RequestConverter;
import ru.rt.payment.core.data.converter.ResponseConverter;
import ru.rt.payment.core.data.HttpRequest;
import ru.rt.payment.core.data.HttpResponse;

public class HttpTransport<RQ extends HttpRequest, RS extends HttpResponse> extends AbstractTransport<RQ, RS> {


    public HttpTransport(ResponseConverter<RQ> responseConverter, RequestConverter<RS> requestConverter) {
        super(responseConverter, requestConverter);
    }

    @Override
    public void sendData(RS response) {
// Sending a request for another server
    }

    @Override
    public RQ receiveData(InputStream inputStream) {
        return null;
    }

    @Override
    protected void prepareRequest() {

    }

    @Override
    protected void prepareResponse() {

    }
}
