package com.exercice.TPSpring.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="stagiaire")
public class Stagiaire extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private Date dateDeNaissance;
    @ManyToOne
    private Formateur formateur;

    public Stagiaire() {

    }

    public Stagiaire(long id, String civilite, String nom, String prenom, String email, Adresse adresse, Date dateDeNaissance, Formateur formateur) {
        super(civilite, nom, prenom, email, adresse);
        this.id = id;
        this.dateDeNaissance = dateDeNaissance;
        this.formateur = formateur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
}
