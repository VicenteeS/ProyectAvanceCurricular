/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anvancecurricular;

import java.util.*;

/**
 *
 * @author seba
 */
public class Estudiante {
    private String nombreEstudiante;
    private HashMap <String,Asignaturas> asignaturasAprobadas = new HashMap();
    //private HashMap <String,Asignaturas> asignaturasVigentes = new HashMap();
    private int añoIngreso;
    private String rut;

    public Estudiante(String nombreEstudiante, int añoIngreso, String rut) {
        this.nombreEstudiante = nombreEstudiante;
        this.añoIngreso = añoIngreso;
        this.rut = rut;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public HashMap<String, Asignaturas> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public void setAsignaturasAprobadas(HashMap<String, Asignaturas> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    /*public HashMap<String, Asignaturas> getAsignaturasVigentes() {
        return asignaturasVigentes;
    }

    public void setAsignaturasVigentes(HashMap<String, Asignaturas> asignaturasVigentes) {
        this.asignaturasVigentes = asignaturasVigentes;
    }*/

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    
}
