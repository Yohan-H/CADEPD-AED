package Clases;

import java.util.*;

public class Profesor extends Persona implements Comparable<Profesor> {
    public String nombreCompleto;
    public String primerApellido;
    public String segundoApellido;
    public int dni;
    public String celular;
    public String direccion;
    public String curso;
    
   public Profesor(String nombreCompleto, String primerApellido, String segundoApellido, int dni, String celular, String direccion, String curso) {
       super(dni,nombreCompleto,primerApellido,segundoApellido);
       this.nombreCompleto = nombreCompleto;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.dni = dni;
       this.celular = celular;
       this.direccion = direccion;
       this.curso = curso;
   }
   public Profesor(Profesor data){
       super(0,"","Peru");
       this.nombreCompleto = data.getNombreCompleto();
   }
   
   public Profesor(int dni, String nombreCompleto, String primerApellido, String segundoApellido, String curso) {
       super(dni,nombreCompleto,primerApellido,segundoApellido);
       this.dni = dni;
       this.nombreCompleto = nombreCompleto; 
       this.primerApellido = primerApellido;
       this.segundoApellido =  segundoApellido;
       this.curso = curso;
   }

    @Override
    public String toString() {
        if (this.celular == null && this.direccion == null)
            return "PROFESOR {" + " dni =" + this.dni + "nombreCompleto=" + this.nombreCompleto + ", primerApellido=" + this.primerApellido 
                    + ", segundoApellido=" + this.segundoApellido;
        else
            return "Profesor{" + "nombreCompleto=" + this.nombreCompleto + ", primerApellido=" + this.primerApellido 
                    + ", segundoApellido=" + this.segundoApellido + ", dni=" + this.dni + ", celular=" + this.celular + ", direccion=" + this.direccion + ", curso=" + this.curso + '}';
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int compareTo(Profesor p) {
        return this.dni - p.dni;
    }
    /*
    public int compareTo(Persona p) {
        return this.codPersona - p.codPersona;
    }*/
}