package ru.rt.payment.controller;

import ru.rt.payment.core.data.HttpRequest;
import ru.rt.payment.core.data.HttpResponse;
import ru.rt.payment.core.controller.Controller;
import ru.rt.payment.model.PaymentType;
import ru.rt.payment.service.payment.PaymentSystem;

public class PaymentController<RQ extends HttpRequest, RS extends HttpResponse>
    implements Controller<RQ, RS> {

    private PaymentSystem paymentSystem;

    @Override
    public void init() {

    }

    @Override
    public void doGet(final RQ req, final RS res) {

    }

    @Override
    public void doPost(final RQ req, final RS res) {

    }

    private void setPaymentSystem(PaymentType type) {
//        Обращаемся к enum-фабрики и по типу устанавливаем подходящий класс
    }
}
