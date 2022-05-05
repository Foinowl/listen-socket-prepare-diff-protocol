package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.Request;
import ru.rt.payment.Response;
import ru.rt.payment.service.PropertyService;
import ru.rt.payment.service.payment.PaymentSystem;
import ru.rt.payment.service.payment.impl.PaymentSystemService;

public abstract class AbstractPaymentSystem<RQ extends Request, RS extends Response> implements PaymentSystem<RQ, RS> {
    private final PropertyService propertyService = (final String name) -> name;

//   Сервис для создания платежей и его статусов.
    private final PaymentSystemService paymentService = new PaymentSystemService();
    private String SecretAPI;

    protected AbstractPaymentSystem(String keyApi) {
        System.out.println("AbstractPaymentSystem: Вызываем конф.метод init() у дочернего класса");
        this.getApiKey(keyApi);
    }

//     Конфигурационный метод для подключения к внешним систем
    abstract public void init(RQ request, RS response);

    private void getApiKey(String keyApi) {
        System.out.println("Берем секретный " + keyApi + " из конфигурационного файла через определенный сервис");
        SecretAPI = propertyService.getValuePropertyByName(keyApi);
    }

    protected String getSecretAPI() {
        return SecretAPI;
    }
}
