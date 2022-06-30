package com.exercice.TPSpring.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    @Size(max = 100)
    private String nom;
    @Column(nullable = false)
    private int duree;
    @Column(nullable = false)
    @Size(max = 20)
    private String difficulte;

    @ManyToMany(mappedBy = "matieres")
    private List<Formateur> formateurs;

    public Matiere() {

    }

    public Matiere(long id, String nom, int duree, String difficulte, List<Formateur> formateurs) {
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
        this.formateurs = formateurs;
    }

    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }
}
