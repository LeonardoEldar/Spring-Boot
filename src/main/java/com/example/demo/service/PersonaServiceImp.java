package com.example.demo.service;

import com.example.demo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{

    @Qualifier("persona2")
    @Autowired
    private IPersonaRepository repository;

    @Override
    public void registrar(String nombre) {
        repository.registrar(nombre);
    }
}
