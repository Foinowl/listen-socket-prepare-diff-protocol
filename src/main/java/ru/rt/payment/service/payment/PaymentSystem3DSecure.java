package ru.rt.payment.service.payment;

import ru.rt.payment.Request;
import ru.rt.payment.Response;

public interface PaymentSystem3DSecure<RQ extends Request, RS extends Response> extends PaymentSystem<RQ, RS> {
    void processSecure();
}
