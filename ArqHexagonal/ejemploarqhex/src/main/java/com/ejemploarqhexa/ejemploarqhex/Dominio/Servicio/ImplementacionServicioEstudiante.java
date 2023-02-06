package com.ejemploarqhexa.ejemploarqhex.Dominio.Servicio;

import java.util.List;
import java.util.Optional;

import com.ejemploarqhexa.ejemploarqhex.Dominio.Excepciones.EstudianteNoEncontradoExcepcion;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Excepciones.ExcepcionNegocio;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos.ModeloEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoPersistenciaEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoServicioEstudiante;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImplementacionServicioEstudiante implements PuertoServicioEstudiante {

    private final PuertoPersistenciaEstudiante puertoPersistenciaEstudiante;

    @Override
    public ModeloEstudiante agregarEstudiante(ModeloEstudiante modeloEstudiante) {
        return this.puertoPersistenciaEstudiante.agregarEstudiante(modeloEstudiante);
    }

    @Override
    public ModeloEstudiante actualizarEstudiante(ModeloEstudiante modeloEstudiante) {
        return this.puertoPersistenciaEstudiante.actualizarEstudiante(modeloEstudiante);
    }

    @Override
    public void borrarEstudiante(Long id) throws ExcepcionNegocio {
        Optional<ModeloEstudiante> existeEstudiante = Optional.ofNullable(
                this.puertoPersistenciaEstudiante.encontrarById(id));
        this.puertoPersistenciaEstudiante
                .borrarEstudiante(existeEstudiante.orElseThrow(EstudianteNoEncontradoExcepcion::new).getId());
    }

    @Override
    public List<ModeloEstudiante> encontrarEstudiantes() {
        return this.puertoPersistenciaEstudiante.encontrarEstudiantes();
    }

    @Override
    public ModeloEstudiante encontrarById(Long id) throws ExcepcionNegocio {
        Optional<ModeloEstudiante> existeEstudiante = Optional.ofNullable(
                this.puertoPersistenciaEstudiante.encontrarById(id));
        return existeEstudiante.orElseThrow(EstudianteNoEncontradoExcepcion::new);
    }

}
