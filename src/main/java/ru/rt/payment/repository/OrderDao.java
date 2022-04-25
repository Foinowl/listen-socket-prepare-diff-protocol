package ru.rt.payment.repository;

import java.util.List;
import ru.rt.payment.model.Order;

public interface OrderDao extends DAO<Order>{

    List<Order> findByUser(long id);
}
