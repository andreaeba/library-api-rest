package com.egg.libreriaapi.controladores;

import com.egg.libreriaapi.entidades.Autor;
import com.egg.libreriaapi.entidades.Editorial;
import com.egg.libreriaapi.excepciones.MyException;
import com.egg.libreriaapi.modelos.EditorialDeleteDTO;
import com.egg.libreriaapi.servicios.EditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/editorial")
public class EditorialControlador {

    @Autowired
    private EditorialServicio editorialServicio;

    @PostMapping("/crear")
    public ResponseEntity<Object> crearEditorial(@RequestParam String nombre) {
        try{
            editorialServicio.crearEditorial(nombre);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("listar")
    public ResponseEntity<List<Editorial>> listarEditoriales() {
        try {
            List<Editorial> editoriales = editorialServicio.listarEditoriales(); // Llama al servicio para obtener la lista de autores
            return new ResponseEntity<>(editoriales,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/modificar")
    public ResponseEntity<Void> modificarEditorial(@RequestParam String nombre, @RequestParam UUID id) {
        try {
            editorialServicio.modificarEditorial(nombre, id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("listar-activas")
    public ResponseEntity<List<Editorial>> listarEditorialesActivas() {
        try {
            List<Editorial> editoriales = editorialServicio.listarEditorialesActivas();
            return new ResponseEntity<>(editoriales, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("listar-inactivas")
    public ResponseEntity<List<Editorial>> listarEditorialesInactivas() {
        try {
            List<Editorial> editoriales = editorialServicio.listarEditorialesInactivas();
            return new ResponseEntity<>(editoriales, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<EditorialDeleteDTO> eliminarEditorial(@PathVariable UUID id) {
        try {
            EditorialDeleteDTO dto = editorialServicio.eliminarEditorial(id);
            return new ResponseEntity<>(dto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
