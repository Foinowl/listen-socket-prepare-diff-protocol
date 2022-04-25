package ru.rt.payment.service.payment.impl;

import ru.rt.payment.service.PropertyService;
import ru.rt.payment.service.payment.PaymentSystem;

public abstract class AbstractPaymentSystem implements PaymentSystem {
    private String SecretAPI;


    private final PropertyService propertyService = new PropertyService() {
        @Override
        public String getValuePropertyByName(final String name) {
            return name;
        }
    };

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
