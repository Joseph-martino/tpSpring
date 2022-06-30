package com.exercice.TPSpring.repositories;

import com.exercice.TPSpring.entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagiaireRepo extends JpaRepository<Stagiaire, Long> {
}
