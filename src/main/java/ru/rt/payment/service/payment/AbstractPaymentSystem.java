package ru.rt.payment.service.payment;

import ru.rt.payment.service.PaymentSystem;

public abstract class AbstractPaymentSystem implements PaymentSystem {
    private String SecretAPI;

    protected AbstractPaymentSystem(String keyApi) {
        System.out.println("AbstractPaymentSystem: Вызываем конф.метод init() у дочернего класса");
        this.getApiKey(keyApi);
        this.init();
    }

    abstract protected void init();

    private void getApiKey(String keyApi) {
        System.out.println("Берем секретный " + " YandexPaymentApi " + " из конфигурационного файла через определенный сервис");
        SecretAPI = keyApi;
    }

    protected String getSecretAPI() {
        return SecretAPI;
    }
}