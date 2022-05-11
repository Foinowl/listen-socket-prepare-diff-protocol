package ru.rt.payment.core.data;

public interface Request {
//    Берем объект по имени класса
    Object getData(Class<?> clazz);

    //    Берем объект по зарезервированному слову
    Object getData(String name);
}
