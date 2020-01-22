package com.ma.supcinema.dao;


import com.ma.supcinema.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface FilmRepository extends JpaRepository<Film,Long> {
}
