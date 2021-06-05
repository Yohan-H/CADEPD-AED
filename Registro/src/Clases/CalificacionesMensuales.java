//Hecho por: Yohan Hilpa Pérez / CRISTHIAN LUIS PUMACAYO GUTIERREZ
import java.util.*;
public class CalificacionesMensuales extends Calificaciones {
	
	private double tareas;						//	30%
	private double examen;						//	50%
	private double participaciones;				//	10%
	private double asistencias;					//	10% //
	private double notaMensual;					// 	100%
	// Buscar la forma de establecer el porcentaje de la nota para cada criterio (tareas, examen, participaciones, asistencias, notaMensual)
	// Curso y Estudiantes (variable donde cojo la info del Estudiante y asigno sus calificaciones)
	public CalificacionesMensuales(String curso, double examen1, double examen2) {
		super(curso, examen1, examen2);
		Scanner sc = new Scanner(System.in);
		this.tareas = sc.nextDouble();
		this.examen = sc.nextDouble();
		this.participaciones = sc.nextDouble();
		this.asistencias = sc.nextDouble();
		this.notaMensual = 0.0;
	}
	
	public double calcularNotaMensual() {
		return this.notaMensual = (this.tareas + this.examen + this.participaciones + this.asistencias);
	}
	
	public double calcularNotaBimestral() {
		return this.calcularNotaMensual();
		// if (this.notalFinal > 12.0 && .notalFinal > 20.0)
		// return ((this.getExamenMensual() + this.getExamenBimestral()/2.0)); 
	}
	
	public void mostrarResultado(double notaMensual) {
		if (12.0 <= notaMensual && notaMensual <= 20.0)
			System.out.println("APROBADO...");
		else if (0.0 <= notaMensual && notaMensual < 12.0) 
			System.out.println("DESAPROBADO...");
		else 
			System.out.println("Mal calculo de la Nota Mensual");
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"Nota Mensual: " + this.calcularNotaMensual() +
				"Nota Bimestral: " + this.calcularNotaBimestral();
	}
	
	public double obtenerPromedioBimestre() {
		return (this.getExamenMensual() + this.getExamenBimestral())/2.0;
	}
}
