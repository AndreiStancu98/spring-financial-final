package com.codecool.springfinancial.location;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocationConfig {
    @Bean
    CommandLineRunner locationRunner (LocationRepository locationRepository) {
        return args -> {
            Location bucuresti = new Location(
                    "Bucuresti",
                    "Calea Victoriei numarul 10 corp A"
            );

            Location ploiesti = new Location(
                    "Ploiesti",
                    "Strada Basarabilor numarul 7"
            );

            Location calarasi = new Location(
                    "Calarasi",
                    "Strada Stirbei Voda numarul 5"
            );

            locationRepository.saveAll(
                    List.of(bucuresti, ploiesti, calarasi)
            );
        };
    }
}
