package com.ejemploarqhexa.ejemploarqhex.Infraestructura.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos.ModeloEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Infraestructura.Entidades.EntidadEstudiante;

@Mapper

public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);

    ModeloEstudiante mapToModelEstudiante(EntidadEstudiante entidadEstudiante);

    EntidadEstudiante mapToEntidadEstudiante(ModeloEstudiante modeloEstudiante);

    List<ModeloEstudiante> mapToModeloListaEstudiante(List<EntidadEstudiante> entidadEstudianteList);

}
