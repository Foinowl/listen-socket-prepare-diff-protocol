package ru.rt.payment;

import java.io.InputStream;

public class SSHTransport<RQ extends SSHRequest, RS extends SSHResponse> extends AbstractTransport<RQ,RS>{

    @Override
    public void sendData(final RS response) {

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
