package ru.rt.payment;

import java.io.InputStream;

public class HttpTransport<RQ extends HttpRequest, RS extends HttpResponse> extends AbstractTransport<RQ, RS> {


    @Override
    public void sendData(final RS response) {
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
