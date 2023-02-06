package com.ejemploarqhexa.ejemploarqhex.Infraestructura.Adaptadores;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ejemploarqhexa.ejemploarqhex.Dominio.Excepciones.ExcepcionNegocio;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos.ModeloEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoPersistenciaEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Infraestructura.Entidades.EntidadEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Infraestructura.Mapper.EstudianteMapper;
import com.ejemploarqhexa.ejemploarqhex.Infraestructura.Repositorio.RepositorioEstudiante;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class EstudianteJpaAdaptador implements PuertoPersistenciaEstudiante {

    private final RepositorioEstudiante repositorioEstudiante;

    @Override
    public ModeloEstudiante agregarEstudiante(ModeloEstudiante modeloEstudiante) {
        EntidadEstudiante entidadEstudiante = EstudianteMapper.INSTANCE.mapToEntidadEstudiante(modeloEstudiante);

        EntidadEstudiante guardarEstudiante = this.repositorioEstudiante.save(entidadEstudiante);

        return EstudianteMapper.INSTANCE.mapToModelEstudiante(guardarEstudiante);
    }

    @Override
    public ModeloEstudiante actualizarEstudiante(ModeloEstudiante modeloEstudiante) {
        return this.agregarEstudiante(modeloEstudiante);
    }

    @Override
    public void borrarEstudiante(Long id) throws ExcepcionNegocio {
        this.repositorioEstudiante.deleteById(id);
    }

    @Override
    public List<ModeloEstudiante> encontrarEstudiantes() {
        return EstudianteMapper.INSTANCE.mapToModeloListaEstudiante(this.repositorioEstudiante.findAll());
    }

    @Override
    public ModeloEstudiante encontrarById(Long id) throws ExcepcionNegocio {
        return this.repositorioEstudiante.findById(id)
                .map(EstudianteMapper.INSTANCE::mapToModelEstudiante)
                .orElse(null);
    }
}
