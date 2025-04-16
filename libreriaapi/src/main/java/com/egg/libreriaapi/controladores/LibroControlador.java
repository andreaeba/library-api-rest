package com.egg.libreriaapi.controladores;

import com.egg.libreriaapi.modelos.LibroCreateDTO;
import com.egg.libreriaapi.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/libro")
public class LibroControlador {

//    @Autowired
//    private LibroServicio libroServicio;
//
//    public ResponseEntity<Object> crearLibro(@RequestBody LibroCreateDTO libroDTO) {
//
//        try {
//            libroServicio.crearLibro(libroDTO);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("{Algún dato no es correcto, revisar}");
//        }
//
//    }
}
