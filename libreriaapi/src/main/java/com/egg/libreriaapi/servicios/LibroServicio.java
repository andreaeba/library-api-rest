package com.egg.libreriaapi.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.egg.libreriaapi.entidades.Autor;
import com.egg.libreriaapi.entidades.Editorial;
import com.egg.libreriaapi.entidades.Libro;
import com.egg.libreriaapi.modelos.LibroCreateDTO;
import com.egg.libreriaapi.repositorios.LibroRepositorio;


@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;


    @Autowired
    private AutorServicio autorServicio;


    @Autowired
    private EditorialServicio editorialServicio;


//    @Transactional
//    public void crearLibro(LibroCreateDTO libroCreateDTO) {
//        Libro libroNvo = new Libro();
//        libroNvo.setIsbn(libroCreateDTO.getIsbn());
//        libroNvo.setTitulo(libroCreateDTO.getTitulo());
//        libroNvo.setEjemplares(libroCreateDTO.getEjemplares());
//        libroNvo.setLibro_activo(libroCreateDTO.isLibroActivo());
//        Autor autor = autorServicio.getOne(libroCreateDTO.getIdAutor());
//        if (autor != null) {
//            libroNvo.setAutor(autor);
//        }
//        Editorial editorial = editorialServicio.getOne(libroCreateDTO.getIdEditorial());
//        if (editorial != null) {
//            libroNvo.setEditorial(editorial);
//        }
//        libroRepositorio.save(libroNvo);
//    }
}