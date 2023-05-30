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

import com.uitaloandrade.moviereview.models.AvaliacaoModel;
import com.uitaloandrade.moviereview.services.AvaliacaoService;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {
	
	@Autowired
	AvaliacaoService avaliacaoService;

	@GetMapping
	public List<AvaliacaoModel> findAll() {
		return avaliacaoService.findAll();
	}
	
	@PostMapping("/{id}")
	public void save(@PathVariable Long id, @RequestBody AvaliacaoModel avaliacaoModel) {
		avaliacaoService.save(id, avaliacaoModel);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		avaliacaoService.delete(id);
	}
	
}
