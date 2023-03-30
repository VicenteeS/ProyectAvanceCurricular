/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anvancecurricular;

/**
 *
 * @author seba
 */
public class Profesores {
    private String nombreProfesor;
    private String titulo;
    private int rut;

    public Profesores(String nombreProfesor, String titulo, int rut) {
        this.nombreProfesor = nombreProfesor;
        this.titulo = titulo;
        this.rut = rut;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    
}
