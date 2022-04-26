package ru.rt.payment.service.payment.strategy;

import ru.rt.payment.service.PropertyService;
import ru.rt.payment.service.payment.PaymentSystem;

public abstract class AbstractPaymentSystem implements PaymentSystem {
    private final PropertyService propertyService = (final String name) -> name;

    private String SecretAPI;

    protected AbstractPaymentSystem(String keyApi) {
        System.out.println("AbstractPaymentSystem: Вызываем конф.метод init() у дочернего класса");
        this.getApiKey(keyApi);
        this.init();
    }

    abstract protected void init();

    private void getApiKey(String keyApi) {
        System.out.println("Берем секретный " + keyApi + " из конфигурационного файла через определенный сервис");
        SecretAPI = propertyService.getValuePropertyByName(keyApi);
    }

    protected String getSecretAPI() {
        return SecretAPI;
    }
}
