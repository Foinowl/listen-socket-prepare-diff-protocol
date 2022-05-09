package ru.rt.payment.service.payment;

import ru.rt.payment.Request;
import ru.rt.payment.Response;

public interface PaymentSystem<RQ extends Request, RS extends Response> {

//   В request можем достать нужный объект, к примеру request.getData("payment");
//   работаем с этим объектом, каждая разная абстракция может добавлять свои ключевые поля
//    после кладем в объект response и передаем управление род. классу
    void pay(RQ request, RS response);

    void refund(RQ request, RS response);

}
