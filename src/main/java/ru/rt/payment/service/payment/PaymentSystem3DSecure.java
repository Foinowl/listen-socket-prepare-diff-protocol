package ru.rt.payment.service.payment;

import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;

public interface PaymentSystem3DSecure<RQ extends Request, RS extends Response> extends PaymentSystem<RQ, RS> {
    void processSecure();
}
