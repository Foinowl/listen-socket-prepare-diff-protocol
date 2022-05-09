package ru.rt.payment;

import java.net.Socket;

public class HTTPSocketHandler<TR extends HttpTransport<HttpRequest, HttpResponse>>
    extends AbstractSocketHandler<HttpRequest, HttpResponse>{


    protected HTTPSocketHandler(Transport<HttpRequest, HttpResponse> transport, final Socket socket) {
        super(transport, socket);
    }

//    В случае http: обрабатываем и парсим входящий запрос из него достаем конечный url.
//    Исходя, что есть в url, если посмотреть стат.картинку, то отправляем ее.
//    Если требуется обработать входящие данные, то ищем подходящий компонент и делигируем его request and response
    @Override
    protected void handle() {
//        Обращаемся к контейнеру, в котором находится компоненты для обработки подходящих запроосов
//        или просто ищем по директории нужный компонент и через bootstrap грузим его
//
    }

    @Override
    public void run() {
//  От сокета получаем данные, черех transport обрабатываем их, вызываем handle(), где делегируем работу на другой компонент
    }
}
