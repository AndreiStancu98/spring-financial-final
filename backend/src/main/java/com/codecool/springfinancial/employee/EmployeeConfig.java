package com.codecool.springfinancial.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner employeeRunner(EmployeeRepository employeeRepository) {
        return args -> {
            Employee andreea = new Employee(
                    "Andreea",
                    "Dumitrescu",
                    LocalDate.of(1993, Month.DECEMBER, 10),
                    "6587496325415"
            );

            Employee lavinia = new Employee(
                    "Lavinia",
                    "Mihalcea",
                    LocalDate.of(1994, Month.MAY, 16),
                    "4513791554966"
            );

            employeeRepository.saveAll(
                    List.of(andreea, lavinia)
            );
        };
    }
}
