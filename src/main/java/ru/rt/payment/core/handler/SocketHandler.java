package ru.rt.payment.core.handler;

import java.io.InputStream;
import java.io.OutputStream;

public interface SocketHandler extends Runnable{

    InputStream getInputStream();

    OutputStream getOutputStream();
}
