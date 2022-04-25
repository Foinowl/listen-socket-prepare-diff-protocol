package ru.rt.payment.repository;

import java.util.Optional;
import ru.rt.payment.model.Card;

public interface CardDao extends DAO<Card>{

//   Находит карту по номеру
    Optional<Card> findByCardNumber(long number);
}
