package com.ma.supcinema.dao;


import com.ma.supcinema.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProjectionRepository extends JpaRepository<Projection,Long> {
}
