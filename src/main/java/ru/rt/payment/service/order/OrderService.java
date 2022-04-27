package ru.rt.payment.service.order;

import java.util.List;
import ru.rt.payment.model.Amount;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.Product;
import ru.rt.payment.model.Status;
import ru.rt.payment.model.User;

// Интерфейс для работы с заказами
public interface OrderService {

    //    Получаем статус заказа по его номеру
    Status getStatusOrder(long id);

    //  История платежей по юзеру
    List<Order> getAllOrdersByUser(User user);

//    Подсчитываем стоимость заказа
    Amount calculateOrderCostByProducts(List<Product> products);

    void createOrder(Order order);

}
