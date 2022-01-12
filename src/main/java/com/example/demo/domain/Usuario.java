package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @NotNull
    private int id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

}
