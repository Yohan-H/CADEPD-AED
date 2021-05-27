
// En cada Bimestre se entrega 1 Informe (Libreta)

// Hecho por: Adrian Gonzalo Valencia / BETSY KRISTY VARGAS ZEGARRA
public abstract class Calificaciones implements PorNota {
	//private Curso curso;
	private double examenMensual;			// 4 Mensuales
	private double examenBimestral;			// 4 Bimestres
	
	public Calificaciones(String curso, double examenMensual, double examenBimestral) {
		setExamenMensual(examenMensual);
		setExamenBimestral(examenBimestral);	
	}
	
	public double getExamenMensual() {
		return this.examenMensual;
	}
	public void setExamenMensual(double examenMensual) {
		if (examenMensual > 0.0 && examenMensual <= 20.0)
				this.examenMensual = examenMensual;
		else
			System.out.println("Nota obtenida fuera de los Límites");
	}

	public double getExamenBimestral() {
		return this.examenBimestral;
	}
	public void setExamenBimestral(double examenBimestral) {
		if (examenBimestral > 0.0 && examenBimestral <= 20.0)
			this.examenBimestral = examenBimestral;
	else
		System.out.println("Nota obtenida fuera de los Límites");
	}

	@Override
	public String toString() {
		return "\n Calificaciones... " + 
			//	"\n Curso: " + this.curso +
				"\n Examen Mensual: " + this.examenMensual  + 
				"\n Examen Bimestral: "+ this.examenBimestral;
	}
	
	// LISTA ENLAZADA: Registro de Calificaciones de Estudiante
}
