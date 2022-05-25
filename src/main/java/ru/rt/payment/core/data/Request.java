package ru.rt.payment.core.data;

public interface Request<T> {
//    Берем объект по имени класса
    T getData(Class<?> clazz);

    //    Берем объект по зарезервированному слову
    T getData(String name);
}
