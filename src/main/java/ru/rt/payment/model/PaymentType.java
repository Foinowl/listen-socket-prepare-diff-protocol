package ru.rt.payment.model;

import java.util.function.Supplier;
import ru.rt.payment.service.payment.PaymentSystem;
import ru.rt.payment.service.payment.impl.PayPal3DSecurePaymentSystem;
import ru.rt.payment.service.payment.impl.PayPalPaymentSystem;
import ru.rt.payment.service.payment.impl.Yandex3DSecurePaymentSystem;
import ru.rt.payment.service.payment.impl.YandexPaymentSystem;

public enum PaymentType {
    YANDEX,
    PAYPAL,

    YANDEX_3DSECURE,

    PAYPAL_3DSECURE
}
