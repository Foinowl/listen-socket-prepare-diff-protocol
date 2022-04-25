package ru.rt.payment.repository;

import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.StatusOrder;

public interface OrderDao extends DAO<Order>{

//    Получение всех платежей по номеру юзера
    List<Order> findByUser(long id);

//    Получение статуса платежа по номеру платежа
    StatusOrder getStatusByOrderId(long id);
}
