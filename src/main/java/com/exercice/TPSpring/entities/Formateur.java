package com.exercice.TPSpring.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="formateur")
public class Formateur extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column( name = "dateEmbauche", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;
    @Column
    private long experience;
    @Column
    private String statusInterne;
    @Column
    private String statusExterne;
    @OneToMany(mappedBy = "formateur")
    private List<Stagiaire> stagiaires;

    @ManyToMany
    @JoinTable(name="skill", joinColumns = @JoinColumn(name="person_id"),
        inverseJoinColumns = @JoinColumn(name = "matiere_id"))
    private List<Matiere> matieres;

    public Formateur() {

    }

    public Formateur(long id, String civilite, String nom, String prenom, String email, Adresse adresse, Date dateEmbauche, long experience, String statusInterne, String statusExterne, List<Stagiaire> stagiaires, List<Matiere> matieres) {
        super(civilite, nom, prenom, email, adresse);
        this.id = id;
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.statusInterne = statusInterne;
        this.statusExterne = statusExterne;
        this.stagiaires = stagiaires;
        this.matieres = matieres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public String getStatusInterne() {
        return statusInterne;
    }

    public void setStatusInterne(String statusInterne) {
        this.statusInterne = statusInterne;
    }

    public String getStatusExterne() {
        return statusExterne;
    }

    public void setStatusExterne(String statusExterne) {
        this.statusExterne = statusExterne;
    }

    public List<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }
}

