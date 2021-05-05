package com.codecool.springfinancial.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public double getAverageRating(){
        List<Rating> ratings = ratingRepository.findAll();
        int averageRatingsSum = 0;
        double averageRating = 0;
        if (!ratings.isEmpty()){
            for (Rating rating : ratings){
                averageRatingsSum += rating.getRating();
            }
            averageRating = averageRatingsSum / ratings.size();
        }
        return averageRating;
    }

    public void saveNewRating(Rating rating){
        ratingRepository.save(rating);
    }
}
