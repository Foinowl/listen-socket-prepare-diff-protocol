package ru.rt.payment;

public interface Request {
    Object getData(Class<?> clazz);

    Object getData(String name);
}
