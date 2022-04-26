package ru.rt.payment.service.payment.strategy;

import java.util.function.Supplier;
import ru.rt.payment.service.payment.PaymentSystem;

public enum PaymentEnum {

    YANDEX(YandexPaymentSystem::new),

    PAYPAL(PayPalPaymentSystem::new),

    YANDEX_3DSECURE(Yandex3DSecurePaymentSystem::new),

    PAYPAL_3DSECURE(PayPal3DSecurePaymentSystem::new);

    final Supplier<PaymentSystem> instantiation;

    PaymentEnum(final Supplier<PaymentSystem> instantiation) {
        this.instantiation = instantiation;
    }

    public PaymentSystem getInstantiation() {
        return instantiation.get();
    }
}
