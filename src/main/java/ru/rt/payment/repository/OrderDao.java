package ru.rt.payment.repository;

import java.util.ArrayList;
import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.StatusOrder;

public interface OrderDao extends DAO<Order> {

    //    Получение всех платежей по номеру юзера
    default List<Order> findByUser(long id) {
        System.out.println("Получение всех платежей по номеру юзера");
        return new ArrayList<>();
    }

    //    Получение статуса платежа по номеру платежа
    default StatusOrder getStatusByOrderId(long id) {
        System.out.println("Получение статуса платежа по номеру платежа");
        return null;
    }

}
