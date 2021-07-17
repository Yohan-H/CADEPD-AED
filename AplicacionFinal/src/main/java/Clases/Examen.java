/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;


public class Examen implements Comparable<Examen>{
    private String nombreProfesor; //nombre del profesor a cargo del examen
    private String nombreCurso; // nombre del curso
    private Date fechaExamen; //hora y fecha del examen
    private String ubicacionExamen; //en que salón se hará el examen
    private Integer duracionExamen; //duración en horas

    
    public Examen(String profesor,String curso,Date fechaExamen,String ubicacion,Integer duracion){
        this.nombreCurso=curso;
        this.nombreProfesor= profesor;
        this.fechaExamen= fechaExamen;
        this.ubicacionExamen= ubicacion;
        this.duracionExamen=duracion;
    }
    /**
     * @return the nombreProfesor
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    /**
     * @param nombreProfesor the nombreProfesor to set
     */
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    /**
     * @return the nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the nombreCurso to set
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the fechaExamen
     */
    public Date getFechaExamen() {
        return fechaExamen;
    }

    /**
     * @param fechaExamen the fechaExamen to set
     */
    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    /**
     * @return the ubicacionExamen
     */
    public String getUbicacionExamen() {
        return ubicacionExamen;
    }

    /**
     * @param ubicacionExamen the ubicacionExamen to set
     */
    public void setUbicacionExamen(String ubicacionExamen) {
        this.ubicacionExamen = ubicacionExamen;
    }

    /**
     * @return the duracionExamen
     */
    public int getDuracionExamen() {
        return duracionExamen;
    }

    /**
     * @param duracionExamen the duracionExamen to set
     */
    public void setDuracionExamen(int duracionExamen) {
        this.duracionExamen = duracionExamen;
    }

    @Override
    public int compareTo(Examen o) {
        //revisa si todos los atributos excepto la duración, son iguales
        boolean comparacion = this.nombreCurso.equals(o.nombreCurso) &
                this.nombreProfesor.equals(o.nombreProfesor) &
                this.fechaExamen.equals(o.fechaExamen)&
                this.ubicacionExamen.equals(o.ubicacionExamen);
        //si la comparación es igual retorna 0 sino retorna la comparación entre fechas de examen
        return (comparacion ? 0 :this.fechaExamen.compareTo(o.fechaExamen));
    
    }
    
    @Override
    public String toString(){
        return
                this.nombreCurso+" "+this.nombreProfesor+" "+this.fechaExamen.toString()
                +" "+this.ubicacionExamen+" "+ this.duracionExamen.toString();
    }
}
