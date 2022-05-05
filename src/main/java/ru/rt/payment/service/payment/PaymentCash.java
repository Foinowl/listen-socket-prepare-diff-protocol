package ru.rt.payment.service.payment;

import ru.rt.payment.Request;
import ru.rt.payment.Response;
import ru.rt.payment.model.Payment;

// Interface for paying for things, pay shekels
public interface PaymentCash<RQ extends Request, RS extends Response> {
    void pay(RQ request, RS response);
}
