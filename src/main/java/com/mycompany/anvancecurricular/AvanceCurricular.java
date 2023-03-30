/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anvancecurricular;

import java.io.*;
import java.util.*;

public class AvanceCurricular {
    
    private HashMap <String,Estudiante> mapaEstudiante = new HashMap();;
    BufferedReader hh = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salir = true;
        AvanceCurricular ac = new AvanceCurricular(); 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while(salir){
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Mostrar datos del estudiante");
            System.out.println("3. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:{
                    ac.ingresarEstudiante();
                    ac.agregarAsignatura();
                }
                case 2:{
                   
                } 
                case 3:{
                    System.out.println("Programa finalizado.");
                    break;
                }
            }
        } 
        
    }
    public void ingresarEstudiante() throws IOException{
        System.out.println("Ingrese rut: ");
        String rut = hh.readLine();
        System.out.println("Ingrese nombre: ");
        String nombreE = hh.readLine();
        System.out.println("Ingrese año de ingreso: ");
        int año = Integer.parseInt(hh.readLine());
        
        Estudiante estudiante = new Estudiante(nombreE, año, rut);
        mapaEstudiante.put(rut, estudiante);  
    }
    
    public void agregarAsignatura() throws IOException{
        
        //HashMap aux;
        
        System.out.println("Ingrese rut: ");
        String rut = hh.readLine();
        
        if(mapaEstudiante.get(rut) != null){
            Estudiante estudiante = mapaEstudiante.get(rut);
            
            System.out.println("Ingrese id de la Asignatura: ");
            String id = hh.readLine();
            System.out.println("Ingrese nombre de la Asignatura: ");
            String nombreA = hh.readLine();
            
            Asignaturas asignaturas = new Asignaturas(nombreA,id);
            
            //aux = estudiante.getAsignaturasAprobadas();
            estudiante.getAsignaturasAprobadas().put(id, asignaturas);
        }
        else{
            System.out.println("Estudiante no encontrado");
        }
    }
}