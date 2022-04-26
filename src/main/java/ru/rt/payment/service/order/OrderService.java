package ru.rt.payment.service.order;

import java.util.List;
import ru.rt.payment.model.Amount;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.Product;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public interface OrderService {

    //    Получаем статус заказа по его номеру
    StatusOrder getStatusOrder(long id);

    //  История платежей по юзеру
    List<Order> getAllOrdersByUser(User user);

//    Подсчитываем стоимость заказа
    Amount calculateOrderCostByProducts(List<Product> products);

    void createOrder(Order order);

}
