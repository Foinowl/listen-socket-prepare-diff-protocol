package ru.rt.payment.model;

import java.util.Date;
import java.util.List;

public class Order {
    private final long id;

    private final List<Product> products;

    private final User user;

    private Status status;

    private final Amount amount;

    private final Date date;

    public Order(final long id, final List<Product> products, final User user, final Status status,
                 final Amount amount, final Date date) {
        this.id = id;
        this.products = products;
        this.user = user;
        this.status = status;
        this.amount = amount;
        this.date = date;
    }

    public void setStatus(final Status status) {
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

    public Status getStatus() {
        return status;
    }

    public Amount getAmount() {
        return amount;
    }

    public Date getDate() {return date;}
}
