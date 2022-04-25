package ru.rt.payment.repository;

import java.util.List;

// Обычный интерфейс для crud операций
public interface DAO<T> {


//    Получаем все элементы
    List<T> findAll();

//    Находим объект по id
    T find(long id);

//    Создаем новую запись в бд
    boolean create(T t);

//    Удаляем запись из бд по объекту
    boolean delete(T t);
}
