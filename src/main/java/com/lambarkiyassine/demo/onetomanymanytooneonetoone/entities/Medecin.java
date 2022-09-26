package com.lambarkiyassine.demo.onetomanymanytooneonetoone.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String specialite;
    private String email;
    @OneToMany(mappedBy = "medecin")
    private Collection<RendezVous> rendezVous;

}
