package com.cg.bookmymovie.movie.movie.resource;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmymovie.movie.movie.entity.Movie;
import com.cg.bookmymovie.movie.movie.entity.RunningTime;
import com.cg.bookmymovie.movie.movie.service.MovieServiceImpl;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	private MovieServiceImpl movieService;

	@PostMapping
	public void addMovies(@RequestBody Movie movie) {
		movieService.addNewMovie(movie);
	}

	@GetMapping
	public ResponseEntity<List<Movie>> getALLMovie() {
		List<Movie> movies = movieService.getAllMovie();
		return new ResponseEntity<>(movies, HttpStatus.OK);
	}

	@GetMapping("/{movieId}")
	public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable Integer movieId) {
		Optional<Movie> movie = movieService.getMovieById(movieId);

		if (!movie.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}
	
	  @PutMapping("{movieId}") 
	  public ResponseEntity<LocalDate> updateMovieReleaseDate(@PathVariable Integer movieId, @RequestParam LocalDate releaseDate) {
	  
		  Optional<Movie> movie = movieService.getMovieById(movieId);
			if (!movie.isPresent()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			movie.get().setReleaseDate(releaseDate);
			movieService.addNewMovie(movie.get());
			return new ResponseEntity<>(releaseDate, HttpStatus.OK);	
	  }
	 

	@DeleteMapping("/{movieId}")
	public ResponseEntity<String> deleteMovies(@PathVariable Integer movieId) {

		Optional<Movie> movie = movieService.getMovieById(movieId);
		if (!movie.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		movieService.deleteMovies(movie.get());
		return new ResponseEntity<>("Movie DEleted SuccessFully", HttpStatus.OK);
	}
	
	
	
	/*@PutMapping("/{movieId}")
	public void updateMovieReleaseDate(@PathVariable int movieId, LocalDate releaseDate) {
		movieService.updateMovieReleaseDate(movieId,releaseDate);
	}*/
	
	
	
	
	
	
}
