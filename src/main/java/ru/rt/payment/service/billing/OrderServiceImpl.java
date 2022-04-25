package ru.rt.payment.service.billing;

import java.util.ArrayList;
import java.util.List;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.PaymentType;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.service.payment.impl.PaymentSystemFactory;

public class OrderServiceImpl implements OrderService {
    @Override
    public StatusOrder getStatusOrder(final long id) {
        System.out.println("Обратились с слою dao и отдали статус заказа");
        return StatusOrder.PAID;
    }

    @Override
    public List<Order> getAllOrdersByUser(final User user) {
        System.out.println("Обратились с слою dao и получили историю платежей");
        return new ArrayList<>();
    }

    @Override
    public void makePayment(final Order order, final PaymentType type) {
        PaymentSystemFactory.getPaymentSystem(type);
        System.out.println("Обратились с слою dao и получили историю платежей");
    }
}
