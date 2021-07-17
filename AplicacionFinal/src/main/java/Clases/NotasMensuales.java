package Clases;

import java.util.*;

public class NotasMensuales extends Nota implements Comparable<NotasMensuales> {
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    public double notaFinal;
    
    public NotasMensuales(double nota1, double nota2, double nota3, double nota4, double notaFinal){
        super("",0.0,0.0);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.notaFinal = notaFinal;
    }
    
    public NotasMensuales(String curso, double ex1, double ex2, double nota1, double nota2, double nota3, double nota4, double notaFinal){
        super(curso,ex1,ex2);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    public String toString() {
        //return "[Nota Final = " + this.notaFinal +"]";
        return "NOTAS -> [ Nota 1 = " + this.nota1 + "| Nota 2 = " + this.nota2 + "| Nota 3 = " + this.nota3 + "| Nota 4=" + this.nota4
                + "| Nota Final=" + this.notaFinal + "] \n";
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNotaFinal() {
        double notaFinal = getNota1() + getNota2() + getNota3() + getNota4();
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    
    public int compareTo(NotasMensuales n) {
        return (int) (this.notaFinal - n.notaFinal);
    }
    
    @Override
    public void resultadoExamMens() {
        if (12.0 <= this.getExamenMensual() && this.getExamenMensual() <=20) {
            System.out.println("El resultado de su examen es... " +
                     "APROBATORIO ");
            System.out.println("La nota de su examen fue: " + this.getExamenMensual());
        }
        else if (0.0 <= this.getExamenMensual() && this.getExamenMensual() < 12.0) {
            System.out.println("El resultado de su examen es... " +
                     "DESAPROBATORIO ");
            System.out.println("La nota de su examen fue: " + this.getExamenMensual());
        }		
    }
    
    @Override
    public void resultadoExamBimes() {
        if (12.0 <= this.getExamenBimestral() && this.getExamenBimestral() <=20) {
            System.out.println("El resultado de su examen es... "
                    + "APROBATORIO ");            
            System.out.println("La nota de su examen fue: " + this.getExamenBimestral());
        }
        else if (0.0 <= this.getExamenBimestral() && this.getExamenBimestral() < 12.0) {
            System.out.println("El resultado de su examen es... "
                    + "DESAPROBATORIO ");
            System.out.println("La nota de su examen fue: " + this.getExamenBimestral());    
        }		
    }
}