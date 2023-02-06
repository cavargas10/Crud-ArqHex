package com.ejemploarqhexa.ejemploarqhex.Dominio.Modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ModeloEstudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
}
