package com.ejemploarqhexa.ejemploarqhex.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoPersistenciaEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Puertos.PuertoServicioEstudiante;
import com.ejemploarqhexa.ejemploarqhex.Dominio.Servicio.ImplementacionServicioEstudiante;

@Configuration
public class EstudianteConfiguracion {
    
    @Bean
    public PuertoServicioEstudiante estudianteServicio
    (PuertoPersistenciaEstudiante puertoPersistenciaEstudiante){
        return new ImplementacionServicioEstudiante(puertoPersistenciaEstudiante);
    }
}
