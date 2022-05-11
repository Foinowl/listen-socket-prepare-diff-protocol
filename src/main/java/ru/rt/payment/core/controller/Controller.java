package ru.rt.payment.core.controller;

import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;

public interface Controller<RQ extends Request, RS extends Response> {

    //    Будем создавать и конфигурировать контроллер
    void init();

    void doGet(RQ req, RS res);

    void doPost(RQ req, RS res);
}
