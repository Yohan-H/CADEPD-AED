package Clases;

import EstructuraDatos.ListLinked.ListLinked;
import EstructuraDatos.ListLinked.Node;

import java.util.*;

public class Alumno extends Persona {
    public String nombreCompleto;
    public String primerApellido;
    public String segundoApellido;
    public int dni;
    public String celular;
    public String direccion;
    public ListLinked notas = new ListLinked();
    
   public Alumno(String nombreCompleto, String primerApellido, String segundoApellido, int dni, String celular, String direccion, ListLinked notas) {
       super(dni,nombreCompleto,primerApellido,segundoApellido);
       this.nombreCompleto = nombreCompleto;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.dni = dni;
       this.celular = celular;
       this.direccion = direccion;
       this.notas = notas;
   }
   
   public Alumno(Alumno data){
       super(0,"","Peru");
       this.nombreCompleto = data.getNombreCompleto();
   }
   
   public Alumno(int dni, String nombreCompleto, String primerApellido, String segundoApellido, ListLinked notas) {
       super(dni,nombreCompleto,primerApellido,segundoApellido);
       this.dni = dni;
       this.nombreCompleto = nombreCompleto;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.notas = notas;
   }
   

    @Override
    public String toString() {
        if (this.celular == null && this.direccion == null)
            return "ALUMNO = [" + "DNI Alumno: " + this.dni + " Nombre: " + this.nombreCompleto + " Apellido Pat.: " + this.primerApellido + " Apellido Mat.:" + this.segundoApellido + " Notas Iniciales: " + this.notas;
        else
            return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", dni=" + dni + ", celular=" + celular + ", direccion=" + direccion + ", notas=" + notas + '}';    
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

    public ListLinked getNotas() {
        return notas;
    }

    public void setNotas(ListLinked notas) {
        this.notas = notas;
    }
    public double getNota1(){
        //return Double.parseDouble(notas.getFirst().getData().toString());
        //return this.notas.getFirst().getData();
        NotasMensuales nota = (NotasMensuales) notas.getFirst().getData();
        return nota.getNota1();
    }
    public double getNota2(){
        NotasMensuales nota = (NotasMensuales) notas.getFirst().getData();
        return nota.getNota2();
    }
    public double getNota3(){
        NotasMensuales nota = (NotasMensuales) notas.getFirst().getData();
        return nota.getNota3();
    }
    public double getNota4(){
        NotasMensuales nota = (NotasMensuales) notas.getFirst().getData();
        return nota.getNota4();
    }
    public double getNotaFinal(){
        NotasMensuales nota = (NotasMensuales) notas.getFirst().getData();
        return nota.getNotaFinal();
    }
    
    public void setNota1(double nota){
        notas.getFirst().setData(nota);
    }
    public void setNota2(double nota){
        notas.getFirst().getNext().setData(nota);
    }
    public void setNota3(double nota){
        notas.getFirst().getNext().getNext().setData(nota);
    }
    public void setNota4(double nota){
        notas.getFirst().getNext().getNext().getNext().setData(nota);
    }
    public void setNotaFinal(double nota){
        notas.getLast().setData(nota);
    }
}
