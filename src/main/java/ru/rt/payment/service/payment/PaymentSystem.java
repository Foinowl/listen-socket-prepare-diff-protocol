package ru.rt.payment.service.payment;

import ru.rt.payment.Request;
import ru.rt.payment.Response;

public interface PaymentSystem<RQ extends Request, RS extends Response> {
    void pay(RQ request, RS response);

    void refund(RQ request, RS response);

}
