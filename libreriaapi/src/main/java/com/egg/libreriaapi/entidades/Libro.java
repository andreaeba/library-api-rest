package com.egg.libreriaapi.entidades;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
public class Libro {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;

    private int ejemplares;

    private boolean libro_activo;

    private String titulo;


    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public boolean isLibro_activo() {
        return libro_activo;
    }

    public void setLibro_activo(boolean libro_activo) {
        this.libro_activo = libro_activo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}