package com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Mapper.EstudianteRestMapper;
import com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Modelos.Respuesta.ModeloRespuesta;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoServicioEstudiante;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/estudiante")
@RequiredArgsConstructor

public class EstudianteControlador {
    private final PuertoServicioEstudiante puertoServicioEstudiante;

    @PostMapping
    public EntidadRespuesta<ModeloRespuesta> agregarEstudiante
    (@RequestBody ModeloRespuesta modeloRespuesta){

        ModeloEstudiante modeloEstudiante = 
        ModeloRespuesta.INSTANCE.mapToModeloEstudiante(modeloRespuesta);

        ModeloRespuesta modeloRespuesta = 
        EstudianteRestMapper.INSTANCE.mapToModeloRespuesta
        this.estudianteServicio.agregarEstudiante(modeloEstudiante));
        
        return EntidadRespuesta.status(HttpStatus.CREATED).body(modeloRespuesta);
    }

    @PutMapping
    public EntidadRespuesta<ModeloRespuesta> actualizarEstudiante
    (@RequestBody ModeloRespuesta modeloRespuesta){

        ModeloEstudiante modeloEstudiante = 
        ModeloRespuesta.INSTANCE.mapToModeloEstudiante(modeloRespuesta);

        ModeloRespuesta modeloRespuesta = 
        EstudianteRestMapper.INSTANCE.mapToModeloRespuesta
        this.estudianteServicio.actualizarEstudiante(modeloEstudiante));
        
        return EntidadRespuesta.status(HttpStatus.CREATED).body(modeloRespuesta);
    }

    @DeleteMapping("/{id}")
    public EntidadRespuesta borrarEstudiante
    (@PathVariable long id) throws BusinessException{
        this.estudianteServicio.borrarEstudiante(id);
        return EntidadRespuesta.ok().body(null);
    }

    @GetMapping
    public EntidadRespuesta<List<ModeloRespuesta>> encontrarEstudiantes(){
        return EntidadRespuesta.ok(
            EstudianteRestMapper.INSTANCE.mapToModeloListaRespuesta(
                this.estudianteServicio.encontrarEstudiantes()
            )
        );
    }

}
