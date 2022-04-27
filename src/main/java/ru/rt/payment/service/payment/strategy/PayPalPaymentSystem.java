package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.model.Order;
import ru.rt.payment.model.Payment;

public class PayPalPaymentSystem extends AbstractPaymentSystem {
    private PayPalPaymentSystem(final String keyApi) {
        super(keyApi);
    }

    protected PayPalPaymentSystem() {
        this("payPal.api");
    }
    @Override
    public void pay(final Payment payment) {
        System.out.println("ПайПел: Продели много шагов по извлечению всей информации из заказа и заплатити шекеля");
    }

    @Override
    public void refund(final Payment payment) {
        System.out.println("PayPal: Нашли карту юзера и вернули шекеля");
    }

    protected void init() {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }
}
