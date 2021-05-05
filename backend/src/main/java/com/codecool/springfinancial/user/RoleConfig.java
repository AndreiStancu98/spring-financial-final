package com.codecool.springfinancial.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoleConfig {
    @Bean
    CommandLineRunner roleRunner(RoleRepository roleRepository) {
        return args -> {
            Role admin = new Role(
                    ERole.ROLE_ADMIN
            );
            Role user = new Role(
                    ERole.ROLE_USER
            );
            roleRepository.saveAll(List.of(admin, user));
        };
    }
}
