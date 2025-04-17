package com.egg.libreriaapi.modelos;


import java.util.UUID;

public class EditorialDeleteDTO {

    private UUID id;
    private String nombre;
    private boolean editorialActiva;

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

    public boolean isEditorialActiva() {
        return editorialActiva;
    }

    public void setEditorialActiva(boolean editorialActiva) {
        this.editorialActiva = editorialActiva;
    }
}
