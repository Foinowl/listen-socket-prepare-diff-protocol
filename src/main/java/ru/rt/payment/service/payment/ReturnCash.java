package ru.rt.payment.service.payment;

import ru.rt.payment.model.Order;

// Интерфейс который возвращает стоимость на основе исторического заказа
public interface ReturnCash {
    void cash(Order order);
}
