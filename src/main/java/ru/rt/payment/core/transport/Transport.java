package ru.rt.payment.core.transport;


import java.io.InputStream;
import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;

public interface Transport<RQ extends Request, RS extends Response> {


    void sendData(RS response);

    RQ receiveData(InputStream inputStream);
}
