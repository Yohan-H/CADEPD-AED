package Clases;

import java.util.*;

//Hecho por: Yohan Hilpa

public class Profesor {
    public String nombreCompleto;
    public String primerApellido;
    public String segundoApellido;
    public int dni;
    public String celular;
    public String direccion;
    public String curso;
    
   public Profesor(String nombreCompleto, String primerApellido, String segundoApellido, int dni, String celular, String direccion, String curso) {
       this.nombreCompleto = nombreCompleto;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.dni = dni;
       this.celular = celular;
       this.direccion = direccion;
       this.curso = curso;
   }
   public Profesor(Profesor data){
       this.nombreCompleto = data.getNombreCompleto();
   }

    @Override
    public String toString() {
        return "Profesor{" + "nombreCompleto=" + nombreCompleto + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", dni=" + dni + ", celular=" + celular + ", direccion=" + direccion + ", curso=" + curso + '}';
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
}