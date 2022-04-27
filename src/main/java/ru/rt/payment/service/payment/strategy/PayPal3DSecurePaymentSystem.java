package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.model.Order;
import ru.rt.payment.model.Payment;
import ru.rt.payment.service.payment.PaymentSystem3DSecure;

public class PayPal3DSecurePaymentSystem extends AbstractPaymentSystem implements PaymentSystem3DSecure {


    private PayPal3DSecurePaymentSystem(final String keyApi) {
        super(keyApi);
    }

    protected PayPal3DSecurePaymentSystem() {
        this("payPal.api");
    }

    @Override
    protected void init() {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }

    @Override
    public void pay(final Payment payment) {
        System.out.println("PayPal3DSecurePaymentSystem : проверь уведомление от своего банка");
    }

    @Override
    public void refund(final Payment payment) {
        System.out.println("PayPal3DSecurePaymentSystem : проверь уведомление от своего банка");
    }
}
