package com.exercice.TPSpring.repositories;

import com.exercice.TPSpring.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepo extends JpaRepository<Adresse, Long> {
}
