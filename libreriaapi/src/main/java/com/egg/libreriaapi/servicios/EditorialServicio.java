package com.egg.libreriaapi.servicios;

import com.egg.libreriaapi.entidades.Autor;
import com.egg.libreriaapi.entidades.Editorial;
import com.egg.libreriaapi.excepciones.MyException;
import com.egg.libreriaapi.modelos.EditorialDeleteDTO;
import com.egg.libreriaapi.repositorios.AutorRepositorio;
import com.egg.libreriaapi.repositorios.EditorialRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) {

        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);
        editorial.setEditorialActiva(true);

        editorialRepositorio.save(editorial);


    }

    // Listar todas las editoriales
    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = new ArrayList<>();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    // Obtener un editorial por ID
    public Optional<Editorial> obtenerEditorialPorId(UUID id) {
        return editorialRepositorio.findById(id);
    }

    // Dar de baja editorial
    public void darBajaEditorial(UUID id) {
        Optional<Editorial> autorADarDeBaja = editorialRepositorio.findById(id);
        if(autorADarDeBaja.isPresent()){
            Editorial editorial = autorADarDeBaja.get();
            editorial.setEditorialActiva(false);
            editorialRepositorio.save(editorial);

        }

    }

    public Editorial getOne(UUID id){
        return editorialRepositorio.getOne(id);
    }

    @Transactional
    public void modificarEditorial(String nombre, UUID id) {
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            System.out.println(editorial);
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        }else {
            throw new NoSuchElementException("No se encontró la editorial con ID: " + id);
        }
    }

    public List<Editorial> listarEditorialesActivas() {
        return editorialRepositorio.findByEditorialActivaTrue();
    }

    public List<Editorial> listarEditorialesInactivas() {
        return editorialRepositorio.findByEditorialActivaFalse();
    }


    public EditorialDeleteDTO eliminarEditorial(UUID id) {
        Editorial editorial = getOne(id);
        editorial.setEditorialActiva(false);
        editorialRepositorio.save(editorial);

        EditorialDeleteDTO dto = new EditorialDeleteDTO();
        dto.setId(editorial.getId());
        dto.setNombre(editorial.getNombre());
        dto.setEditorialActiva(editorial.isEditorialActiva());

        return dto;
    }

    private void validar(String nombre) throws MyException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new MyException("El nombre de la editorial no puede ser nulo o estar vacío");
        }
    }

}
