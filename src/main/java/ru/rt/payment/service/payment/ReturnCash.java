package ru.rt.payment.service.payment;

import ru.rt.payment.Request;
import ru.rt.payment.Response;
import ru.rt.payment.model.Payment;

// An interface that returns the cost based on a historical payment
public interface ReturnCash<RQ extends Request, RS extends Response> {
    void refund(RQ request, RS response);
}
