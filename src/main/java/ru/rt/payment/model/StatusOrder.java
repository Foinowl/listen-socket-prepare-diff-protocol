package ru.rt.payment.model;

public enum StatusOrder {
    WAITING("WAITING"),
    PAID("PAID"),
    REJECTED("REJECTED"),
    EXPIRED("EXPIRED");

    private final String status;

    StatusOrder(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
