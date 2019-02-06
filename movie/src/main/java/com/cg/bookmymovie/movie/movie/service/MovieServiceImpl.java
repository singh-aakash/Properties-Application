package com.cg.bookmymovie.movie.movie.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmymovie.movie.movie.entity.Movie;
import com.cg.bookmymovie.movie.movie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	public void addNewMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public List<Movie> getAllMovie() {

		return movieRepository.findAll();
	}

	public Optional<Movie> getMovieById(int movieId) {
		return movieRepository.findById(movieId);
	}

	public void deleteMovies(Movie movie) {
		movieRepository.delete(movie);
	}

	/*public void updateMovieReleaseDate(int movieId, LocalDate releaseDate) {
	
		Movie movie = movieRepository.findById(movieId).get();
		movie.setReleaseDate(releaseDate);
		movieRepository.save(movie);
		
	}*/

}
