package ru.rt.payment.service.payment.impl;

import ru.rt.payment.model.Order;

public class YandexPaymentSystem extends AbstractPaymentSystem {

    private YandexPaymentSystem(String propertyApiKey) {
        super(propertyApiKey);
    }

    protected YandexPaymentSystem() {
        this("yandex.api");
    }

    @Override
    public void pay(final Order order) {
        System.out.println("Yandex: заплатили деревянными за заказ :) ");
    }

    @Override
    public void cash(final Order order) {
        System.out.println("Yandex: вернули уже в зелени за заказ :) ");
    }

    @Override
    protected void init() {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }
}
