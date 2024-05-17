package wiledw.MovieMeter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import wiledw.MovieMeter.repository.ReviewRepository;
import wiledw.MovieMeter.model.Movie;
import wiledw.MovieMeter.model.Review;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate; // Make custom query using mongoTemplate, while repository does basic CRUD operation
    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
