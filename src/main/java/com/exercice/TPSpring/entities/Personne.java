package com.exercice.TPSpring.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="personne")
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    @Size(max = 10)
    private String civilite;
    @Column(nullable = false)
    @Size(max = 255)
    private String nom;
    @Column(nullable = false)
    @Size(max = 255)
    private String prenom;
    @Column(nullable = false)
    @Size(max = 255)
    private String email;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
    public Personne() {

    }

    public Personne(long id, String civilite, String nom, String prenom, String email, Adresse adresse) {
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
