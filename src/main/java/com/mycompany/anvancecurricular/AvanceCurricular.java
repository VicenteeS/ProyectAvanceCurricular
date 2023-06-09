/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anvancecurricular;

import java.io.*;
import java.util.*;

public class AvanceCurricular {
    
    private HashMap <String,Estudiante> mapaEstudiante = new HashMap();
    private HashMap <String,Asignatura> mapaAsignatura = new HashMap();
    BufferedReader hh = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salir = true;
        AvanceCurricular ac = new AvanceCurricular(); 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while(salir){
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ingresar asignaturas a un estudiante");
            System.out.println("3. Mostrar datos del estudiante");
            System.out.println("0. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:{
                    ac.ingresarEstudiante();
                }
                case 2:{
                   ac.agregarAsignatura();
                } 
                case 3:{
                    ac.mostrarDatosEstudiante();
                }
                case 0:{
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
        System.out.println("Ingrese rut: ");
        String rut = hh.readLine();
        
        Estudiante estudiante = mapaEstudiante.get(rut);
        
        if(estudiante != null){
            
            System.out.println("Ingrese id de la Asignatura: ");
            String id = hh.readLine();
            
            Asignatura asignatura = mapaAsignatura.get(id);
            
            if (asignatura != null){
                
                estudiante.agregarAsignaturas(asignatura.getNombreAsignatura(), asignatura.getIdAsignatura());
            }
            else{
                System.out.println("Asignatura no encontrada");
            }
        }
        else{
            System.out.println("Estudiante no encontrado");
        }
    }
    public void mostrarDatosEstudiante() throws IOException{
        
        System.out.println("Ingrese rut del Estudiante: ");
        String rut = hh.readLine();
        
        Estudiante estudiante = mapaEstudiante.get(rut);
        
        if(estudiante != null){
            System.out.println("Estudiante: "+ estudiante.getNombreEstudiante()
                                +". Rut: "+estudiante.getRut());
            System.out.println("Sus asignaturas son: ");
            ArrayList <Asignatura> aa = estudiante.getAsignaturasAprobadas();
                 
            Asignatura asignatura;
            int aux = aa.size();
            for (int i = 0; i <= aux; i++){
                
                asignatura = aa.get(i);
                System.out.println("Asignatura: "+asignatura.getNombreAsignatura()+
                                   ". Id: "+asignatura.getIdAsignatura());
            }
        }
    }
}
