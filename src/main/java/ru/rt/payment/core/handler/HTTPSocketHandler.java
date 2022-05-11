package ru.rt.payment.core.handler;

import java.net.Socket;
import ru.rt.payment.core.transport.HttpTransport;
import ru.rt.payment.core.data.HttpRequest;
import ru.rt.payment.core.data.HttpResponse;

public class HTTPSocketHandler<TR extends HttpTransport<HttpRequest, HttpResponse>>
    extends AbstractSocketHandler<HttpRequest, HttpResponse> {

    private HandleRequest<HttpRequest, HttpResponse> handleRequest;

    protected HTTPSocketHandler(TR transport, Socket socket) {
        super(transport, socket);
    }

//    В случае http: обрабатываем и парсим входящий запрос из него достаем конечный url.
//    Исходя, что есть в url, если посмотреть стат.картинку, то отправляем ее.
//    Если требуется обработать входящие данные, то ищем подходящий компонент и передаем ему request and response
    @Override
    protected void handle() {
//        Has-A: на handleRequest передаем управление.
    }

    @Override
    public void run() {
//  От сокета получаем данные, черех transport обрабатываем их, вызываем handle(), где делегируем работу на другой компонент
    }
}
