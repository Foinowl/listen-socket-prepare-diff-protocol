package ru.rt.payment;


import java.io.InputStream;

public interface Transport<RQ extends Request, RS extends Response> {


    void sendData(RS response);

    RQ receiveData(InputStream inputStream);
}
