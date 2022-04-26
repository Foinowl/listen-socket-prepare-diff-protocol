package ru.rt.payment.service.order;

import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.service.payment.impl.PaymentEnum;

public interface OrderService {

    //    Получаем статус заказа по его номеру
    StatusOrder getStatusOrder(long id);

    //  История платежей по юзеру
    List<Order> getAllOrdersByUser(User user);

    //    оформляем заказ
    void makePayment(Order order, PaymentEnum type);
}
