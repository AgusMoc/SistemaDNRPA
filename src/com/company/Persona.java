package com.company;

import java.util.List;

public class Persona {
    /*
    Todos los vehículos tienen un único propietario y autorizados a conducir.
	De los propietarios y autorizados se sabe el nombre, DNI y dirección.

     */
    protected String nombre;
    protected String dni;
    protected String direccion;


    public Persona(String nombre, String dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
}
