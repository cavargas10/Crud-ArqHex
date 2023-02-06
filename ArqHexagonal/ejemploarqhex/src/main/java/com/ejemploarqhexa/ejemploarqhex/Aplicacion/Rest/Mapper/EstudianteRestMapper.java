package com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Modelos.Respuesta.ModeloRespuesta;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos.ModeloEstudiante;

@Mapper
public interface EstudianteRestMapper {
    EstudianteRestMapper INSTANCE = 
    Mappers.getMapper(EstudianteRestMapper.class);

    ModeloEstudiante mapToModeloEstudiante
    (ModeloRespuesta modeloRespuesta);

    ModeloRespuesta mapToModeloRespuesta
    (ModeloEstudiante modeloEstudiante);

    List<ModeloRespuesta> mapToModeloListaRespuesta
    (List<ModeloEstudiante> modeloEstudiante);
}
