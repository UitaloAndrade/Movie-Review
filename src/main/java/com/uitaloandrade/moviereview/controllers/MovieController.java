package com.uitaloandrade.moviereview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uitaloandrade.moviereview.models.MovieModel;
import com.uitaloandrade.moviereview.services.MovieService;

import jakarta.persistence.PostUpdate;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping
	public List<MovieModel> findAll() {
		return movieService.findAll();
	}
	
	@GetMapping("/{id}")
	public MovieModel getById(Long id) {
		return movieService.getById(id);
	}
	
	@PostMapping
	public void save(@RequestBody  MovieModel movieModel) {
		movieService.save(movieModel);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		movieService.delete(id);
	}
	
	@PostMapping("/{id}")
	@PostUpdate
	public void update(@RequestBody Long id, MovieModel movieModel) {
		movieService.update(id, movieModel);
	}

}
