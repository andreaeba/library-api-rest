package com.egg.libreriaapi.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

   private String nombre;

   private Boolean autorActivo;


    public Autor() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAutorActivo() {
        return autorActivo;
    }

    public void setAutorActivo(Boolean autorActivo) {
        this.autorActivo = autorActivo;
    }
}