package ru.rt.payment.model;

public enum Status {
    WAITING("WAITING"),
    PAID("PAID"),
    REJECTED("REJECTED"),
    EXPIRED("EXPIRED"),
    RETURNED("RETURNED"),
    CANCELED("CANCELED");

    private final String status;

    Status(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
