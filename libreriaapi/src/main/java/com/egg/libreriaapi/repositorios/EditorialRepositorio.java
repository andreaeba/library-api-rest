package com.egg.libreriaapi.repositorios;

import com.egg.libreriaapi.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, UUID> {

    List<Editorial> findByEditorialActivaTrue();

    List<Editorial> findByEditorialActivaFalse();
}
