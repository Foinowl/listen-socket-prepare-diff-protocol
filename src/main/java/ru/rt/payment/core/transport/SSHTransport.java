package ru.rt.payment.core.transport;

import java.io.InputStream;
import ru.rt.payment.core.data.SSHRequest;
import ru.rt.payment.core.data.SSHResponse;
import ru.rt.payment.core.data.converter.RequestConverter;
import ru.rt.payment.core.data.converter.ResponseConverter;
import ru.rt.payment.core.transport.AbstractTransport;

public class SSHTransport<RQ extends SSHRequest, RS extends SSHResponse> extends AbstractTransport<RQ,RS> {


    public SSHTransport(final ResponseConverter<RQ> responseConverter, final RequestConverter<RS> requestConverter) {
        super(responseConverter, requestConverter);
    }

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
