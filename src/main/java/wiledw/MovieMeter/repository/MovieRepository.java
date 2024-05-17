package wiledw.MovieMeter.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import wiledw.MovieMeter.model.Movie;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findMovieByImdbId(String imdbId);
}
