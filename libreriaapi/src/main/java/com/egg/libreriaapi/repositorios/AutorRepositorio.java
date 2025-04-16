package com.egg.libreriaapi.repositorios;

import com.egg.libreriaapi.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, UUID> {
}
