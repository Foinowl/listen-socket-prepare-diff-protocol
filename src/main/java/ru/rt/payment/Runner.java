package ru.rt.payment;

import java.time.ZonedDateTime;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import ru.rt.payment.model.Amount;
import ru.rt.payment.model.Card;
import ru.rt.payment.model.Order;
import ru.rt.payment.model.PaymentType;
import ru.rt.payment.model.Product;
import ru.rt.payment.model.StatusOrder;
import ru.rt.payment.model.User;
import ru.rt.payment.service.billing.OrderService;
import ru.rt.payment.service.billing.OrderServiceImpl;

public class Runner {
    public static void main(String[] args) {
        System.out.println("runner started");

        OrderService orderService = new OrderServiceImpl();

        Card card = new Card()
            .setCardNumber("4269 5789 0003 002")
            .setCardholderName("Petrov")
            .setCvv(228)
            .setExpirationYear(2022)
            .setExpirationYear(5)
            .setId(1);
        User user = new User("Petrov", "+3845678132", "nifpopnaf@ukrop.by");

        Order order1 = new Order(1, List.of(new Product()),
            user, StatusOrder.WAITING, ZonedDateTime.now().plusHours(1), new Amount(500,
            Currency.getInstance("RUR")));

        Order order2 = new Order(2, List.of(new Product()),
            user, StatusOrder.WAITING, ZonedDateTime.now().plusHours(1), new Amount(500,
            Currency.getInstance(Locale.US)));

        Order order3 = new Order(3, List.of(new Product()),
            user, StatusOrder.WAITING, ZonedDateTime.now().plusHours(1), new Amount(500,
            Currency.getInstance(Locale.US)));
        
        orderService.makePayment(order1, PaymentType.YANDEX);

        orderService.makePayment(order2, PaymentType.PAYMENT);

        orderService.makePayment3D(order3, PaymentType.PAYMENT);

    }
}
