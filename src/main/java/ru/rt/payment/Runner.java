package ru.rt.payment;

import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ru.rt.payment.model.Amount;
import ru.rt.payment.model.Card;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.Product;
import ru.rt.payment.model.Status;
import ru.rt.payment.model.User;
import ru.rt.payment.service.order.OrderService;
import ru.rt.payment.service.order.OrderServiceImpl;
import ru.rt.payment.service.payment.impl.PaymentSystemService;
import ru.rt.payment.service.payment.strategy.PayPal3DSecurePaymentSystem;
import ru.rt.payment.service.payment.strategy.PaymentEnum;

public class Runner {
    public static void main(String[] args) {
        System.out.println("runner started");

        OrderService orderService = new OrderServiceImpl();

        Card card = new Card()
            .setCardNumber("4269 5789 0003 002")
            .setCardholderName("Petrov")
            .setCvv(228)
            .setExpirationYear(2022)
            .setExpirationYear(4)
            .setId(1);
        User user = new User("Petrov", "+798*", "nifpopnaf@ukrop.by", card);

        Order order1 = new Order(1, List.of(new Product()),
            user, Status.WAITING, new Amount(500,
            Currency.getInstance("RUR")), new Date());

        Order order2 = new Order(2, List.of(new Product()),
            user, Status.WAITING, new Amount(500,
            Currency.getInstance(Locale.US)), new Date());

        Order order3 = new Order(3, List.of(new Product()),
            user, Status.WAITING, new Amount(500,
            Currency.getInstance(Locale.US)), new Date());


//        Products can be in different currencies, convert to one
//        orderService.calculateOrderCostByProducts();

        PaymentSystemService facade = new PaymentSystemService();

        facade.makeOrder(order1, PaymentEnum.YANDEX);
        facade.makeOrder(order1, PaymentEnum.PAYPAL);
        facade.makeOrder(order1, PaymentEnum.PAYPAL_3DSECURE);
    }
}
