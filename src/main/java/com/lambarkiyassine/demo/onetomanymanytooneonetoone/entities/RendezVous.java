package com.lambarkiyassine.demo.onetomanymanytooneonetoone.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RendezVous {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateRendezVous;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;
    @OneToOne
    private Consultation consultation;
}
