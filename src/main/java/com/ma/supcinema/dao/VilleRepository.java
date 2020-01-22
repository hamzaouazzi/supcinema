package com.ma.supcinema.dao;


import com.ma.supcinema.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {
}
