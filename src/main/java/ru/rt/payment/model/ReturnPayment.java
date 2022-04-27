package ru.rt.payment.model;

import java.util.Date;

public class ReturnPayment {
    private final long id;

    Payment payment;

    private Date date;

    public ReturnPayment(final long id, final Payment payment, final Date date) {
        this.id = id;
        this.payment = payment;
        this.date = date;
    }
}
