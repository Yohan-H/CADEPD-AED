package Clases;

import java.util.Scanner;

// Hecho por: Adrian Valencia

abstract public class Calificaciones {
	private String curso;
	private double examenMensual;			// 4 Mensuales
	private double examenBimestral;			// 4 Bimestres
	
	Scanner sc = new Scanner(System.in);

	public Calificaciones(String curso, double examenMensual, double examenBimestral) {
		this.curso = curso;
		this.examenMensual = examenMensual;
		this.examenBimestral = examenBimestral;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	//Hecho por: Adrian Gonzalo Valencia
	public double getExamenMensual() { return this.examenMensual; }
	public void setExamenMensual(double examenMensual) {
		if (examenMensual > 0.0 && examenMensual <= 20.0)
				this.examenMensual = examenMensual;
		else {
			System.out.println("Nota Mensual ingresada fuera de los Límites..."
					+ "\n vuelva a Ingresar la Nota");
			this.setExamenMensual(sc.nextDouble());
		}
	}

	//Hecho por: Adrian Gonzalo Valencia
	public double getExamenBimestral() { return this.examenBimestral;}
	public void setExamenBimestral(double examenBimestral) {
		if (examenBimestral > 0.0 && examenBimestral <= 20.0)
			this.examenBimestral = examenBimestral;
		else {
			System.out.println("Nota Bimestral ingresada fuera de los Límites..."
					+ "\n vuelva a Ingresar la Nota");
			this.setExamenBimestral(sc.nextDouble());
		}
	}

	@Override
	public String toString() {
		return "\n CALIFICACIONES DE EXAMENES DEL BIMESTRE: " + 
				"\n Curso: " + this.curso +
				"\n Examen Mensual: " + this.examenMensual  + 
				"\n Examen Bimestral: "+ this.examenBimestral;
	}
	
	abstract public void resultadoExamMens();
	abstract public void resultadoExamBimes();
	
	// LISTA ENLAZADA: Registro de Calificaciones de Estudiante
}
