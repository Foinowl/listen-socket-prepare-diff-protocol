package ru.rt.payment.model;

public class Card {
    private long id;
    private String cardNumber;

    private int expirationMonth;

    private int expirationYear;

    private String cardholderName;

    private int cvv;

    public Card(final long id, final String cardNumber, final int expirationMonth,
                final int expirationYear,
                final String cardholderName, final int cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cardholderName = cardholderName;
        this.cvv = cvv;
    }

    public Card() {
    }

    public long getId() {
        return id;
    }

    public Card setId(final long id) {
        this.id = id;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public Card setExpirationMonth(final int expirationMonth) {
        this.expirationMonth = expirationMonth;
        return this;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public Card setExpirationYear(final int expirationYear) {
        this.expirationYear = expirationYear;
        return this;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public Card setCardholderName(final String cardholderName) {
        this.cardholderName = cardholderName;
        return this;
    }

    public int getCvv() {
        return cvv;
    }

    public Card setCvv(final int cvv) {
        this.cvv = cvv;
        return this;
    }
}
