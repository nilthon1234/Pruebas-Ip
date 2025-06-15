package com.prueba.ip.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
}
