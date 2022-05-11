package ru.rt.payment.core.data;

public interface Response {
    //    Устанавливаем объект по имени класса

    void setData(Class<?> clazz);
    //    Берем объект по зарезервированному слову

    void setData(String name);
}
