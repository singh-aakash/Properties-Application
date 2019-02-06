package com.cg.bookmymovie.movie.movie.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.cg.bookmymovie.movie.movie.entity.Movie;

public interface MovieService {

	void addNewMovie(Movie movie);
	
	List<Movie> getAllMovie();
	/*public void updateMovieReleaseDate(int movieId, LocalDate releaseDate);
	*/
	Optional<Movie> getMovieById(int movieId);
	
	void deleteMovies(Movie movie);
}