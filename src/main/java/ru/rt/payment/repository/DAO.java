package ru.rt.payment.repository;

import java.util.List;

public interface DAO<T> {

    List<T> findAll();

    T find(long id);

    boolean create(T t);

    boolean delete(T t);
}
