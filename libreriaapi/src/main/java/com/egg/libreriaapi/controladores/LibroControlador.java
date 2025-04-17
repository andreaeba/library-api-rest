package com.egg.libreriaapi.controladores;


import com.egg.libreriaapi.entidades.Editorial;
import com.egg.libreriaapi.modelos.LibroListarActivosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.egg.libreriaapi.modelos.LibroCreateDTO;
import com.egg.libreriaapi.servicios.LibroServicio;

import java.util.List;


@RestController
@RequestMapping("/libro")
public class LibroControlador {
    @Autowired
    private LibroServicio libroServicio;


    @PostMapping("/crear")
    public ResponseEntity<Object> crearLibro(@RequestBody LibroCreateDTO libroDTO) {
        try {
            libroServicio.crearLibro(libroDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"Algun dato no es correcto o es nulo, revisar.\"}");
        }
    }

    @GetMapping("/listarLibrosActivos")
    public ResponseEntity<List<LibroListarActivosDTO>> encontrarActivos() {
        try {
            List<LibroListarActivosDTO> librosActivos = libroServicio.encontrarActivos();
            return new ResponseEntity<>(librosActivos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}