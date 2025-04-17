package com.egg.libreriaapi.modelos;

public class LibroListarActivosDTO {

    private Long isbn;//Este dato sera utilizado como idLibro
    private String titulo;
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

    public boolean isLibroActivo() {
        return libroActivo;
    }

    public void setLibroActivo(boolean libroActivo) {
        this.libroActivo = libroActivo;
    }

    public LibroListarActivosDTO(Long isbn, String titulo, boolean libroActivo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.libroActivo = libroActivo;
    }

}
