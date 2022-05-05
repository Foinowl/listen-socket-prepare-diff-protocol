package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.Request;
import ru.rt.payment.Response;

public class PayPalPaymentSystem<RQ extends Request, RS extends Response> extends AbstractPaymentSystem<RQ, RS> {
    private PayPalPaymentSystem(final String keyApi) {
        super(keyApi);
    }

    protected PayPalPaymentSystem() {
        this("payPal.api");
    }

    public void init(RQ request, RS response) {
        System.out.println("Проделали большую работу по настройки с внешней системой");
    }

    @Override
    public void pay(final RQ request, final RS response) {
        System.out.println("ПайПел: Продели много шагов по извлечению всей информации из заказа и заплатити шекеля");

    }

    @Override
    public void refund(final RQ request, final RS response) {
        System.out.println("PayPal: Нашли карту юзера и вернули шекеля");
    }
}
