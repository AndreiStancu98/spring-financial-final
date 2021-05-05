package com.codecool.springfinancial.card;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findByAccountId(Long accountId);
    List<Card> findByAccountNumber(String accountNumber);
    Boolean existsByCardNumber(String cardNumber);
}
