package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.Request;
import ru.rt.payment.Response;

public class YandexPaymentSystem<RQ extends Request, RS extends Response> extends AbstractPaymentSystem<RQ, RS> {

    private YandexPaymentSystem(String propertyApiKey) {
        super(propertyApiKey);
    }

    protected YandexPaymentSystem() {
        this("yandex.api");
    }

    @Override
    public void init(RQ request, RS response) {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }

    @Override
    public void pay(final RQ request, final RS response) {
        System.out.println("Yandex: заплатили деревянными за заказ :) ");
    }

    @Override
    public void refund(final RQ request, final RS response) {
        System.out.println("Yandex: вернули уже в зелени за заказ :) ");
    }
}
