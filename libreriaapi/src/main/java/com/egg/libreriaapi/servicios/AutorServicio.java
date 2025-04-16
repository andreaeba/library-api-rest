package com.egg.libreriaapi.servicios;

import com.egg.libreriaapi.entidades.Autor;
import com.egg.libreriaapi.excepciones.MyException;
import com.egg.libreriaapi.repositorios.AutorRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MyException {

        validar(nombre);

        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAutorActivo(true);

        autorRepositorio.save(autor);
    }

    // Listar todos los autores
    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList<>();
        autores = autorRepositorio.findAll();
        return autores;
    }


    // Obtener un autor por ID
    public Optional<Autor> obtenerAutorPorId(UUID id) {
        return autorRepositorio.findById(id);
    }

    // Dar de baja autor
    public void darBajaAutor(UUID id) {
        Optional<Autor> autorADarDeBaja = autorRepositorio.findById(id);
        if(autorADarDeBaja.isPresent()){
            Autor autor = autorADarDeBaja.get();
            autor.setAutorActivo(false);
            autorRepositorio.save(autor);

        }

    }

    @Transactional
    public void modificarAutor(String nombre, UUID id) {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            System.out.println(autor);
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }else {
            throw new NoSuchElementException("No se encontró el autor con ID: " + id);
        }}

    public Autor getOne(UUID id){
        return autorRepositorio.getOne(id);
    }

    private void validar(String nombre) throws MyException {
        if (nombre == null || nombre.isEmpty()  ) {
            throw new MyException("el nombre no puede ser nulo o estar vacío");
        }
    }
}