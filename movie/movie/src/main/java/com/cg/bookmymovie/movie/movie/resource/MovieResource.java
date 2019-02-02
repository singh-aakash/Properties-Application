package com.cg.bookmymovie.movie.movie.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmymovie.movie.movie.entity.Movie;
import com.cg.bookmymovie.movie.movie.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public void addMovies(@RequestBody Movie movie) {
		movieService.addNewMovie(movie);
	}
	
}
