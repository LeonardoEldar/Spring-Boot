package com.example.demo.controller;

import com.example.demo.domain.Persona;
import com.example.demo.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepo iPersonaRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        Persona persona = new Persona();
        persona.setIdPersona(2);
        persona.setNombre("Agus");
        iPersonaRepo.save(persona);
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/listarPersonas")
    public String listarPersonas(Model model) {
        model.addAttribute("personas",  iPersonaRepo.findAll());
        return "listarPersonas";
    }
}
