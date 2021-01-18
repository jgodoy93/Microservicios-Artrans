package com.artrans.apm.test1msv.model;


import com.artrans.apm.test1msv.enun.Permisos;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Empleado {

    private String id;
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean habilitado;
    private Permisos permiso;
    private String emailLab;

    private String clave;

    private List<Bono> bonos;



}
