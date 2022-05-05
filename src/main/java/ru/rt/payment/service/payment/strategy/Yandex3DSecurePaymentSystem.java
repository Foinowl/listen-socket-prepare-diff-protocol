package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.Request;
import ru.rt.payment.Response;
import ru.rt.payment.service.payment.PaymentSystem3DSecure;

public class Yandex3DSecurePaymentSystem<RQ extends Request, RS extends Response> extends AbstractPaymentSystem<RQ, RS>
    implements PaymentSystem3DSecure<RQ, RS> {
    private Yandex3DSecurePaymentSystem(final String keyApi) {
        super(keyApi);
    }

    protected Yandex3DSecurePaymentSystem() {
        this("yandex.api");
    }

    @Override
    public void init(RQ request, RS response) {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }

    @Override
    public void processSecure() {

    }

    @Override
    public void pay(final RQ request, final RS response) {
        System.out.println("Yandex3DSecurePaymentSystem : проверь уведомление от своего банка");
    }

    @Override
    public void refund(final RQ request, final RS response) {
        System.out.println("Yandex3DSecurePaymentSystem : проверь уведомление от своего банка");
    }
}
