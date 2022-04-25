package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Order;
import ru.rt.payment.service.payment.PaymentSystem3DSecure;

public class PayPalPaymentSystem extends AbstractPaymentSystem implements PaymentSystem3DSecure {
    protected PayPalPaymentSystem(final String keyApi) {
        super(keyApi);
    }

    @Override
    public void pay(final Order order) {
        System.out.println("ПайПел: Продели много шагов по извлечению всей информации из заказа и заплатити шекеля");
    }

    @Override
    public void cash(final Order order) {
        System.out.println("PayPal: Нашли карту юзера и вернули шекеля");
    }

    protected void init() {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }


    @Override
    public void make3DSecure() {
        System.out.println("PayPal: Только темная сторона может реализовать алгоритм");
    }
}
