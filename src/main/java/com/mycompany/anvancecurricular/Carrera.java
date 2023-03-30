/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anvancecurricular;

/**
 *
 * @author seba
 */
public class Carrera {
    private String nombreCarrera;
    private int semestreCarrera;
    private Asignaturas [] asignaturaCarrera;

    public Carrera(String nombreCarrera, int semestreCarrera, Asignaturas[] asignaturaCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.semestreCarrera = semestreCarrera;
        this.asignaturaCarrera = asignaturaCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getSemestreCarrera() {
        return semestreCarrera;
    }

    public void setSemestreCarrera(int semestreCarrera) {
        this.semestreCarrera = semestreCarrera;
    }

    public Asignaturas[] getAsignaturaCarrera() {
        return asignaturaCarrera;
    }

    public void setAsignaturaCarrera(Asignaturas[] asignaturaCarrera) {
        this.asignaturaCarrera = asignaturaCarrera;
    }
    
    
}
