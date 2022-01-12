package com.example.demo.domain;

import com.example.demo.repository.PersonaRepositoryImp1;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Persona {

    @Id
    @NotNull
    @Column(name = "id_persona", length = 50)
    private int idPersona;

    @NotEmpty
    private String nombre;
}
