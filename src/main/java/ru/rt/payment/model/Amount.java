package ru.rt.payment.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Amount {
    private BigDecimal total;
    private Currency currency;

    public Amount(final BigDecimal total, final Currency currency) {
        this.total = total;
        this.currency = currency;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setTotal(final BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Amount amount = (Amount) o;
        return Objects.equals(total, amount.total) && Objects.equals(currency, amount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, currency);
    }

    public void setCurrency(final Currency currency) {
        this.currency = currency;
    }
}
