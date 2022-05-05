package ru.rt.payment;

import java.net.Socket;

public class HTTPSocketHandler<TR extends HttpTransport<HttpRequest, HttpResponse>>
    extends AbstractSocketHandler<HttpRequest, HttpResponse>{


    protected HTTPSocketHandler(Transport<HttpRequest, HttpResponse> transport, final Socket socket) {
        super(transport, socket);
    }

    @Override
    protected void handle() {
//        Обращаемся к контейнеру, в котором находится компоненты для обработки подходящих запроосов
//
    }

    @Override
    public void run() {
//  От сокета получаем данные, черех transport обрабатываем их, вызываем handle(), где делегируем работу на другой компонент
    }
}
