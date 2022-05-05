package ru.rt.payment;

public interface Response {
    void setData(Class<?> clazz);

    void setData(String name);
}
