package ru.rt.payment.service.payment.impl;

import java.util.Date;
import ru.rt.payment.model.Payment;
import ru.rt.payment.model.ReturnPayment;
import ru.rt.payment.repository.OrderDao;
import ru.rt.payment.repository.PaymentDao;
import ru.rt.payment.repository.ReturnDao;
import ru.rt.payment.service.payment.PaymentService;

public class ReturnCashService {

    private PaymentService paymentService;

    private OrderDao orderDao;

    private PaymentDao paymentDao;

    private ReturnDao returnDao;

    public ReturnPayment findReturnPayment() {
        return null;
    }

    public void createReturnPayment(Payment payment) {
//        create instance of return payment
        returnDao.create(new ReturnPayment(12L, payment, new Date()));
    }

    public void getAllReturnPayment() {
        returnDao.findAll();
    }
}
