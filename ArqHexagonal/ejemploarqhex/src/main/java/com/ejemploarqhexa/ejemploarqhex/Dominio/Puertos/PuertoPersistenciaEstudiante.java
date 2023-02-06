package com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos;

import java.util.List;

import com.ejemploarqhexa.ejemploarqhex.Dominio.Excepciones.ExcepcionNegocio;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos.ModeloEstudiante;

public interface PuertoPersistenciaEstudiante {

    ModeloEstudiante agregarEstudiante(ModeloEstudiante modeloEstudiante);

    ModeloEstudiante actualizarEstudiante(ModeloEstudiante modeloEstudiante);

    void borrarEstudiante(Long id) throws ExcepcionNegocio;

    List<ModeloEstudiante> encontrarEstudiantes();

    ModeloEstudiante encontrarById(Long id) throws ExcepcionNegocio;

}