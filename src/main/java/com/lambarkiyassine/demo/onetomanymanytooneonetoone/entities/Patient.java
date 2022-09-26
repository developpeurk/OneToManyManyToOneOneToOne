package com.lambarkiyassine.demo.onetomanymanytooneonetoone.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "patient")
    private Collection<RendezVous> rendezVous;
}
