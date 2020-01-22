package com.ma.supcinema.dao;


import com.ma.supcinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface CinemaRepository extends JpaRepository<Cinema,Long> {

}
