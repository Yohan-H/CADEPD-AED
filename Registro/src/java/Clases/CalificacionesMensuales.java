package Clases;

// Hecho por: Adrian Valencia

public class CalificacionesMensuales extends Calificaciones {
	public double nota1;					// nota de tareas
    public double nota2;					// nota de participaciones
    public double nota3;					// nota de asistencias
    public double nota4;					// nota de examen
    public double notaFinal;
    
    public CalificacionesMensuales(String curso, double ex1, double ex2, double nota1, double nota2, double nota3, double nota4, double notaFinal){
    	super(curso, ex1, ex2);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.notaFinal = notaFinal;
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
    
    public double calcularNotaBimestre() {
		return (this.getNotaFinal() + this.getNotaFinal())/2;
	}
	
	public double calcularNotaFinal() {
		return (this.calcularNotaBimestre()+this.calcularNotaBimestre()+this.calcularNotaBimestre()+this.calcularNotaBimestre())/4;
	}
	
	public void resultadoNotas(double nota) {
		if (12.0 <= nota && nota <= 20.0)
			System.out.println("APROBADO...");
		else if (0.0 <= nota && nota < 12.0) 
			System.out.println("DESAPROBADO...");
		else 
			System.out.println("La nota ingresada, ha sido mal hallada... ");
	}
	

	@Override
	public void resultadoExamMens() {
		if (12.0 <= this.getExamenMensual() && this.getExamenMensual() <=20) {
			System.out.println("El resultado de su examen es... "
					+ "APROBATORIO ");
			System.out.println("La nota de su examen fue: " + this.getExamenMensual());
		}
		else if (0.0 <= this.getExamenMensual() && this.getExamenMensual() < 12.0) {
			System.out.println("El resultado de su examen es... "
					+ "DESAPROBATORIO ");
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
