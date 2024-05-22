package wiledw.MovieMeter.unitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import wiledw.MovieMeter.model.Movie;
import wiledw.MovieMeter.repository.MovieRepository;
import wiledw.MovieMeter.service.MovieService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {
    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @Test
    public void MovieService_findMovieByImdbId_ReturnsMovieDto() {
        // Arrange
        String imdbId = "tt1234567";
        Movie expectedMovie = new Movie();
        expectedMovie.setImdbId(imdbId);
        expectedMovie.setTitle("Test Movie");

        when(movieRepository.findMovieByImdbId(imdbId)).thenReturn(Optional.of(expectedMovie));

        // Act
        Optional<Movie> actualMovie = movieService.findMovieByImdbId(imdbId);

        // Assert
        assertEquals(Optional.of(expectedMovie), actualMovie);
    }
}
