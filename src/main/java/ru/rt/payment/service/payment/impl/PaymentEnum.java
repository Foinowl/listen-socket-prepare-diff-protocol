package ru.rt.payment.service.payment.impl;

import java.util.function.Supplier;
import ru.rt.payment.service.payment.PaymentSystem;

public enum PaymentEnum {

    YANDEX(YandexPaymentSystem::new),

    PAYPAL(PayPalPaymentSystem::new),

    YANDEX_3DSECURE(Yandex3DSecurePaymentSystem::new),

    PAYPAL_3DSECURE(PayPal3DSecurePaymentSystem::new);

    Supplier<PaymentSystem> instantiator;

    PaymentEnum(final Supplier<PaymentSystem> instantiator) {
        this.instantiator = instantiator;
    }

    public PaymentSystem getInstantiator() {
        return instantiator.get();
    }
}
