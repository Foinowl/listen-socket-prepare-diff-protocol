package ru.rt.payment.model;

import java.util.Date;

public class Payment {
    private final long id;

    private Amount amount;

    private User user;

    private Card card;

    private Date date;

    private Status status;

    private Card receiverCard;

    public Payment(final long id, final Amount amount, final User user, final Card card, final Date date,
                   final Status status, final Card receiverCard) {
        this.id = id;
        this.amount = amount;
        this.user = user;
        this.card = card;
        this.date = date;
        this.status = status;
        this.receiverCard = receiverCard;
    }

    public long getId() {
        return id;
    }

    public Amount getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    public Card getCard() {
        return card;
    }

    public Date getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public Card getReceiverCard() {
        return receiverCard;
    }

    public void setReceiverCard(final Card receiverCard) {
        this.receiverCard = receiverCard;
    }
}
