package com.ejemploarqhexa.ejemploarqhex.Aplicacion.Rest.Modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
}
