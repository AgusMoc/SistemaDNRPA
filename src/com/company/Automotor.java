package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Automotor {
    protected Persona propietario;
    protected List<Persona> autorizados;
    protected String seccional;
    protected String tipoAutomotor;
    protected String tipoUso;
    protected String patente;

    List<String> tiposAutomotores = new ArrayList<String>(Arrays.asList("moto eléctrica", "auto eléctrico", "motocicleta", "automóvil a combustión", "colectivo", "utilitario", "camion"));
    List<String> tiposUsos = new ArrayList<String>(Arrays.asList("profesional","particular"));


    public Automotor(String seccional, String patente, Persona propietario, String tipoAutomotor,String tipoUso,List<Persona> autorizados) {
        this.patente = patente;
        this.autorizados = autorizados;
        this.seccional = seccional;
        this.tipoAutomotor = tipoAutomotor;
        this.tipoUso = tipoUso;
        this.propietario = propietario;
    }

    public String getTipoAutomotor() {
        return tipoAutomotor;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public String nombrePropietario(){
         return getPropietario().getNombre();
       }

       public String datosAutomotores(){
        return tipoAutomotor+" de uso "+ tipoUso+ " de patente " + patente +" perteneciente a "+ propietario.getNombre();
       }
}
