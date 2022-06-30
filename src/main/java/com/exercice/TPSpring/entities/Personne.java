package com.exercice.TPSpring.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public abstract class Personne {

    @Column
    @NotNull
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

    public Personne(String civilite, String nom, String prenom, String email, Adresse adresse) {
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
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
