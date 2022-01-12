package com.example.demo.rest;

import com.example.demo.domain.Persona;
import com.example.demo.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

    @Autowired
    private IPersonaRepo iPersonaRepo;

    @GetMapping()
    public List<Persona> listar(){
        return iPersonaRepo.findAll();
    }

    @PostMapping()
    public void insertar(@RequestBody Persona persona){
         iPersonaRepo.save(persona);
    }

    @PutMapping()
    public void modificar(@RequestBody Persona persona){
        iPersonaRepo.save(persona);
    }

    @DeleteMapping()
    public void eliminar(@RequestParam Integer idPersona){
        Optional<Persona> persona = iPersonaRepo.findById(idPersona);
        persona.ifPresent(value -> iPersonaRepo.delete(value));
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarV2(@PathVariable("id") Integer id){
        Optional<Persona> persona = iPersonaRepo.findById(id);
        persona.ifPresent(value -> iPersonaRepo.deleteById(value.getIdPersona()));
    }
}
