package ru.rt.payment.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private final long id;

    private final List<Product> products;

    private final User user;

    private StatusOrder status;

    private final ZonedDateTime expirationBillTime;

    private final Amount amount;

    public Order(final long id, final List<Product> products, final User user, final StatusOrder status,
                 final ZonedDateTime expirationBillTime,
                 final Amount amount) {
        this.id = id;
        this.products = products;
        this.user = user;
        this.status = status;
        this.expirationBillTime = expirationBillTime;
        this.amount = amount;
    }

    public void setStatus(final StatusOrder status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public ZonedDateTime getExpirationBillTime() {
        return expirationBillTime;
    }

    public Amount getAmount() {
        return amount;
    }
}
