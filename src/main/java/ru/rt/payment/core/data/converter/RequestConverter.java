package ru.rt.payment.core.data.converter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// В зависимости от используемого протокола, можно создать новые классы для его обработки
public interface RequestConverter<Request> {
    Request readRequest(InputStream inputStream) throws IOException;

    void writeRequest(OutputStream outputStream, Request request) throws IOException;
}
