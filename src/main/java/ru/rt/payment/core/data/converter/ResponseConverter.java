package ru.rt.payment.core.data.converter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// В зависимости от используемого протокола, можно создать новые классы для его обработки
public interface ResponseConverter<Response> {
    Response readResponse(InputStream inputStream) throws IOException;

    void writeResponse(OutputStream outputStream, Response response) throws IOException;
}
