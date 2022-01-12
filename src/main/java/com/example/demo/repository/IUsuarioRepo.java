package com.example.demo.repository;

import com.example.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
}
