package com.codecool.springfinancial.transaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TransactionConfig {
    @Bean
    CommandLineRunner transactionRunner(TransactionRepository transactionRepository){
        return args -> {
            Transaction one = new Transaction(
                1L,
                "a",
                LocalDate.of(2024, Month.OCTOBER, 10),
                1D,
                "b",
                1L
            );

            transactionRepository.saveAll(List.of(one));
        };
    }
}
