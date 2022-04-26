package ru.rt.payment.service.order;

import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.repository.OrderDao;
import ru.rt.payment.service.payment.impl.PaymentEnum;
import ru.rt.payment.service.payment.impl.PaymentSystemFactory;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDao() {
        @Override
        public List<Order> findByUser(final long id) {
            return OrderDao.super.findByUser(id);
        }

        @Override
        public StatusOrder getStatusByOrderId(final long id) {
            return OrderDao.super.getStatusByOrderId(id);
        }
    };

    @Override
    public StatusOrder getStatusOrder(final long id) {
        System.out.println("Обратились с слою dao и отдали статус заказа");
        return orderDao.getStatusByOrderId(id);
    }

    @Override
    public List<Order> getAllOrdersByUser(final User user) {
        System.out.println("Обратились с слою dao и получили историю платежей");
        return orderDao.findByUser(1);
    }

    @Override
    public void makePayment(final Order order, final PaymentEnum type) {
//        Создаем заказ в таблице бд
        orderDao.create(order);
        PaymentSystemFactory.getPaymentSystem(type).pay(order);
//        В зависимости от обработки paymentSystem, можно изменять статус обработки заказа
    }
}
