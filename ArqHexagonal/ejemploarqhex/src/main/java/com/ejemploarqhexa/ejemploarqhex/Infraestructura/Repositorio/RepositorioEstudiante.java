package com.ejemploarqhexa.ejemploarqhex.Infraestructura.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.ejemploarqhexa.ejemploarqhex.Infraestructura.Entidades.EntidadEstudiante;

@Repository
public interface RepositorioEstudiante extends JpaRepositoryExtension<EntidadEstudiante, Long> {

    void deleteById(Long id);

    List<EntidadEstudiante> findAll();

    Object findById(Long id);

    EntidadEstudiante save(EntidadEstudiante entidadEstudiante);

}
