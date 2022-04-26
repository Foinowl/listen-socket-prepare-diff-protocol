package ru.rt.payment.service.order;

import java.util.List;
import ru.rt.payment.model.Amount;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.Product;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.repository.OrderDao;

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
    public Amount calculateOrderCostByProducts(final List<Product> products) {
//       Рассчитываем общую стоимость всех продуктов, далее формируем общую стоимость на основе инстанса Amount
        Long sum = products.stream().map(fn -> fn.getAmount().getTotal()).reduce(0L, Long::sum);
        return null;
    }

    @Override
    public void createOrder(final Order order) {
        //        Создаем заказ в таблице бд, ловим ошибки и кэшируем их
        orderDao.create(order);
    }

}
