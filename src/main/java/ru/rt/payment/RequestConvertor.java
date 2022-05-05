package ru.rt.payment;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface RequestConvertor {
    Request readRequest(InputStream inputStream) throws IOException;

    void writeRequest(OutputStream outputStream, Request request) throws IOException;
}
