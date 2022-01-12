package com.example.demo.repository;

import com.example.demo.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
}
