package ru.rt.payment.repository;

import java.util.Optional;
import ru.rt.payment.model.Card;

public interface CardDao extends DAO<Card> {

    //   Находит карту по номеру
    default Optional<Card> findByCardNumber(long number) {
        System.out.println("Находит карту по номеру");
        return Optional.empty();
    }

}
