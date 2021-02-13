package com.company;
import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* CONSIGNA
La DNRPA (Dirección Nac. Reg. Propiedad del Automotor) necesita un sistema para anotar todos los vehículos registrados en el país.
La DNRPA tiene Registros seccionales.Cada Registro tiene automotores registrados.
Los automotores pueden ser de uso particular o profesional.
Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.
Todos los vehículos tienen un único propietario y autorizados a conducir.
De los propietarios y autorizados se sabe el nombre, DNI y dirección.

1)	Se desea poder listar todos los autos registrados en todas las seccionales.
2)	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
         */
        /* MI INTEPRETACIÓN
Cuando se quiere registrar un nuevo automotor se toman primero los datos de las personas (propietario y a quienes autoriza a conducir)
Se toman luego los datos del automotor --> patente, proíetario, seccional en que inscribe, tipo de uso y demás.
El sistema debería:
 *validar ingresos (tipo de uso, tipo de automotor, etc) --> NO ESTA HECHO ESTO
 *permiter ingresar los datos de personas y automotores --> NO ESTA HECHO ... hice una bbdd de prueba
         */

        // BBDD DE PERSONAS (para probar el sistema)
        Persona pers1 = new Persona("Carlitos", "254", "Pampa y la vía");
        Persona pers2 = new Persona("Nemo", "666", "Calle Wallabi 42");
        Persona pers3 = new Persona("Agus", "888854", "mi casa");
        Persona pers4 = new Persona("Pepe", "1235", "Florida");
        Persona pers5 = new Persona("Ricky", "1235sasa", "Miameeee");

        List<Persona> autorizadosCarlitos = new ArrayList<>();
        autorizadosCarlitos.add(pers2);
        autorizadosCarlitos.add(pers3);
        List<Persona> autorizadosNemo = new ArrayList<>();
        autorizadosNemo.add(pers1);
        autorizadosNemo.add(pers3);
        List<Persona> autorizadosAgus = new ArrayList<>();
        autorizadosAgus.add(pers1);
        autorizadosAgus.add(pers2);
        List<Persona> autorizadosPepe = new ArrayList<>();
        autorizadosPepe.add(pers1);
        autorizadosPepe.add(pers2);
        List<Persona> autorizadosRicky = new ArrayList<>();

        // BBDD DE AUTOMOTORES (para probar el sistema)
        Automotor autito = new Automotor("nro3", "ABC 123", pers1, "camion", "particular", autorizadosCarlitos, LocalDate.of(2020, 02, 15));
        Automotor coche = new Automotor("nro3", "DEF 132", pers2, "camion", "particular", autorizadosNemo, LocalDate.of(2018, 02, 14));
        Automotor autito2 = new Automotor("nro2", "GE3 353", pers3, "auto", "profesional", autorizadosAgus, LocalDate.of(2015, 11, 14));
        Automotor coche2 = new Automotor("nro1", "KJD 923", pers4, "moto", "particular", autorizadosPepe, LocalDate.of(2006, 05, 06));
        Automotor tutu = new Automotor("nro2", "NRL 198", pers5, "auto", "profesional", autorizadosRicky, LocalDate.of(2001, 12, 05));

        List<Automotor> registros = new ArrayList<>();
        registros.add(autito);
        registros.add(coche);
        registros.add(autito2);
        registros.add(coche2);
        registros.add(tutu);

        //1)Se desea poder listar todos los autos registrados en todas las seccionales.

        System.out.println("Los autos registrados en la DNRPA son: ");
        for (Automotor y : registros) {
            if (y.getTipoAutomotor() == "auto") System.out.println(y.datosAutomotores());
        }

        autito.cambiarDueño(pers5, LocalDate.of(2014, 02, 14));
        //2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.

        System.out.println("Los propietarios de camiones registrados en la DNRPA son: ");
        List<String> aux = new ArrayList<>();
        for (Automotor y : registros) {
            if (y.getTipoAutomotor() == "camion") aux.add(y.nombrePropietario());
        }
        Collections.sort(aux);
        for (String x : aux) {
            System.out.println(x);
        }

    }
}

