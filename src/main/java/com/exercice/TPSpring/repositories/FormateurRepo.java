package com.exercice.TPSpring.repositories;

import com.exercice.TPSpring.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface FormateurRepo extends JpaRepository<Formateur, Long> {


}
