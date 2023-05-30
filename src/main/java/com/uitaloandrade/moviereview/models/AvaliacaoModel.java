package com.uitaloandrade.moviereview.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_avaliacao")
public class AvaliacaoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private MovieModel movieModel;

	@Column
	private Double nota;
	@Column(columnDefinition = "TEXT")
	private String comentario;

	public AvaliacaoModel() {
	}

	public AvaliacaoModel(Double nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public MovieModel getMovieModel() {
		return movieModel;
	}

	public void setMovieModel(MovieModel movieModel) {
		this.movieModel = movieModel;
	}
	
	

}
