package com.uitaloandrade.moviereview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uitaloandrade.moviereview.models.MovieModel;
import com.uitaloandrade.moviereview.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<MovieModel> findAll() {
		return movieRepository.findAll();
	}
	
	public MovieModel getById(Long id) {
		return movieRepository.getReferenceById(id);
	}
	
	@Transactional
	public void save(MovieModel movieModel) {
		movieRepository.save(movieModel);
	}
	
	@Transactional
	public void delete(long id) {
		movieRepository.deleteById(id);
	}
	
	@Transactional
	public void update(Long id, MovieModel movieModel) {
		MovieModel movie = movieRepository.getReferenceById(id);
		
		if(movieModel.equals(movie)) {
			movie.setTitulo(movieModel.getTitulo());
			movie.setDiretor(movieModel.getDiretor());
			movie.setAnoLancamento(movieModel.getAnoLancamento());
			movie.setSinopse(movieModel.getSinopse());
			movie.setNota(movieModel.getNota());			
		}
	}
	
}
