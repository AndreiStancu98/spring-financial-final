package com.codecool.springfinancial.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class RatingController {
    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/average-rating")
    public double getAverageRating(){
        return ratingService.getAverageRating();
    }

    @PostMapping("/new-rating")
    public void saveNewRating(Rating rating){
        ratingService.saveNewRating(rating);
    }
}
