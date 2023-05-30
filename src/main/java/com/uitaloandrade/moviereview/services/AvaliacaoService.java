package com.uitaloandrade.moviereview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uitaloandrade.moviereview.models.AvaliacaoModel;
import com.uitaloandrade.moviereview.models.MovieModel;
import com.uitaloandrade.moviereview.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	
	@Autowired
	private MovieService movieService;
	
	public List<AvaliacaoModel> findAll() {
		return avaliacaoRepository.findAll();
	}
	
	@Transactional
	public void save(Long id, AvaliacaoModel avaliacaoModel) {
		MovieModel movie = movieService.getById(id);
		
		avaliacaoModel.setMovieModel(movie);
		
		avaliacaoRepository.save(avaliacaoModel);
	}
	
	@Transactional
	public void delete(Long id) {
		avaliacaoRepository.deleteById(id);
	}
}
