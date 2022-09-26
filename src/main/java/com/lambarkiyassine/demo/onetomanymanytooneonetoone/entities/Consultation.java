package com.lambarkiyassine.demo.onetomanymanytooneonetoone.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateConsultation;
    private String rapportConsulation;
    private double prixConsultation;
    @OneToOne(mappedBy = "consultation")
    private RendezVous rendezVous;
}