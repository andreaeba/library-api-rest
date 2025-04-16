package com.egg.libreriaapi.controladores;


import com.egg.libreriaapi.excepciones.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.egg.libreriaapi.entidades.Autor;
import com.egg.libreriaapi.servicios.AutorServicio;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/autor")
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;



    @PostMapping("crear")
    public ResponseEntity<Object> crearAutor(@RequestParam String nombre) {
        try {
            autorServicio.crearAutor(nombre);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("listar")
    public ResponseEntity<List<Autor>> listarAutores() {
        try {
            List<Autor> autores = autorServicio.listarAutores(); // Llama al servicio para obtener la lista de autores
            return new ResponseEntity<>(autores,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/modificar")
    public ResponseEntity<Void> modificarAutor(@RequestParam String nombre, @RequestParam UUID id) {
        try {
            autorServicio.modificarAutor(nombre, id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}