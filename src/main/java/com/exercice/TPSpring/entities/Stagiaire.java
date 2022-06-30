package com.exercice.TPSpring.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="stagiaire")
public class Stagiaire extends Personne{
    private Date dateDeNaissance;
    private Formateur formateur;

    public Stagiaire() {

    }

    public Stagiaire(long id, String civilite, String nom, String prenom, String email, Adresse adresse, Date dateDeNaissance, Formateur formateur) {
        super(id, civilite, nom, prenom, email, adresse);
        this.dateDeNaissance = dateDeNaissance;
        this.formateur = formateur;
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
