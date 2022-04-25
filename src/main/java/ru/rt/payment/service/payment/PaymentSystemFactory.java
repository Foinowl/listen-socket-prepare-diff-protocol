package ru.rt.payment.service.payment;

import ru.rt.payment.model.PaymentType;
import ru.rt.payment.service.PaymentSystem;
import ru.rt.payment.service.payment.PayPalPaymentSystem;

public class PaymentSystemFactory {

    public static PaymentSystem getPaymentSystem(PaymentType type) {
        PaymentSystem paymentSystem = null;
        switch (type) {
            case PAYMENT -> paymentSystem = createPayPal();
            case YANDEX -> paymentSystem = createYandex();
        }
        return paymentSystem;
    }

    private static PaymentSystem createYandex() {
        return new YandexPaymentSystem("yandex.api");
    }

    public static PaymentSystem createPayPal() {
        return new PayPalPaymentSystem("payPal.api");
    }
}
