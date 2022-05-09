package ru.rt.payment.repository;

import java.util.List;

// Скорее будет использоваться соедение с бд через jdbc
// но так же можно через любой другой источник внешней информации
// Обычный интерфейс для crud операций
public interface DAO<T> {


    //    Получаем все элементы
    default List<T> findAll() {
        System.out.println("Получаем все элементы");
        return null;
    }

    //    Находим объект по id
    default T find(long id) {
        System.out.println("Находим объект по id");
        return null;
    }

    //    Создаем новую запись в бд
    default boolean create(T t) {
        System.out.println("Создаем новую запись в бд");
        return false;
    }

    //    Удаляем запись из бд по объекту
    default boolean delete(T t) {
        System.out.println("Удаляем запись из бд по объекту");
        return false;
    }


    default boolean update(T t){
        System.out.println("Обновляем запись из бд по объекту");
        return false;
    }
}
