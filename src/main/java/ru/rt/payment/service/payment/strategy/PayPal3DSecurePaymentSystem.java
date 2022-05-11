package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.core.data.Request;
import ru.rt.payment.core.data.Response;
import ru.rt.payment.service.payment.PaymentSystem3DSecure;

public class PayPal3DSecurePaymentSystem<RQ extends Request, RS extends Response> extends AbstractPaymentSystem<RQ, RS>
    implements PaymentSystem3DSecure<RQ, RS> {


    private PayPal3DSecurePaymentSystem(final String keyApi) {
        super(keyApi);
    }

    protected PayPal3DSecurePaymentSystem() {
        this("payPal.api");
    }

    @Override
    public void init(RQ request, RS response) {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }

    @Override
    public void processSecure() {
//        Через смс-уведомление запрашиваем одобрение или через любое другое уведомление.
    }

    @Override
    public void pay(final Request request, final Response response) {
        System.out.println("PayPal3DSecurePaymentSystem : проверь уведомление от своего банка");

    }

    @Override
    public void refund(final Request request, final Response response) {
        System.out.println("PayPal3DSecurePaymentSystem : проверь уведомление от своего банка");
    }
}
