package ru.rt.payment.service.billing;

import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.PaymentType;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;

public interface OrderService {

//    Получаем статус заказа по его номеру
    StatusOrder getStatusOrder(long id);

//  История платежей по юзеру
    List<Order> getAllOrdersByUser(User user);

//    оформляем заказ
    void makePayment(Order order, PaymentType type);
}
