package com.uitaloandrade.moviereview.models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_movie")

public class MovieModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String titulo;
	@Column
	private String diretor;
	@Column
	private Date anoLancamento;
	@Column(columnDefinition = "TEXT")
	private String sinopse;
	@Column
	private Double nota;
	@OneToMany(mappedBy = "movieModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AvaliacaoModel> avaliacaoModel;
	
	public MovieModel() {
	}
	
	public MovieModel(String titulo, String diretor, Date anoLancamento, String sinopse, Double nota) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
		this.sinopse = sinopse;
		this.nota = nota;
	}
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public Date getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieModel other = (MovieModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(titulo, other.titulo);
	}
	
}
