/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author
 */
public class Persona implements Comparable<Persona> {
    private int codPersona;
    private String nombre, AMaterno, APaterno;
    //protected char sexo;
    private String direccion, pais;
    
    public Persona (int dni, String nombre, String apellido1, String apellido2){
        this.codPersona = dni;
        this.nombre = nombre;
        this.APaterno = apellido1;
        this.AMaterno = apellido2;
    }
    
    
    
    public Persona (int dni, String direccion, String pais){
        this.codPersona = dni;
        this.direccion = direccion;
        this.pais = pais;
    }
    

    @Override
    public int compareTo(Persona p) {
        return this.codPersona - p.codPersona;
    }
    
}
