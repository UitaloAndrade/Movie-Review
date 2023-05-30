package com.uitaloandrade.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uitaloandrade.moviereview.models.MovieModel;

public interface MovieRepository extends JpaRepository<MovieModel, Long>{

}
