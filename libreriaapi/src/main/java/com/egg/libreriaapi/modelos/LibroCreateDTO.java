package com.egg.libreriaapi.modelos;


//import lombok.Data;


import java.util.UUID;

//@Data
public class LibroCreateDTO {
    private Long isbn;//Este dato sera utilizado como idLibro
    private String titulo;
    private Integer ejemplares;
    private UUID idAutor;
    private UUID idEditorial;
    private boolean libroActivo;

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public UUID getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(UUID idAutor) {
        this.idAutor = idAutor;
    }

    public UUID getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(UUID idEditorial) {
        this.idEditorial = idEditorial;
    }

    public boolean isLibroActivo() {
        return libroActivo;
    }

    public void setLibroActivo(boolean libroActivo) {
        this.libroActivo = libroActivo;
    }


}