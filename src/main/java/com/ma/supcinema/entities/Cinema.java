package com.ma.supcinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @AllArgsConstructor @NoArgsConstructor @ToString @Data
public class Cinema implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude,latitude,altitude;
    private int nombreSalles;
    @OneToMany(mappedBy ="cinema" )
    private Collection<Salle> salles;
    @ManyToOne
    private Ville ville;



}
