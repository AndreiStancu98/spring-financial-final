package com.codecool.springfinancial.rating;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RatingConfiguration {

    @Bean
    CommandLineRunner ratingRunner(RatingRepository ratingRepository){
        return args -> {
            Rating ratingOne = new Rating(1);
            Rating ratingTwo = new Rating(2);
            Rating ratingThree = new Rating(3);
            Rating ratingFour = new Rating(4);
            Rating ratingFive = new Rating(5);
            ratingRepository.saveAll(List.of(ratingOne, ratingTwo, ratingThree, ratingFour, ratingFive));
        };
    }
}
