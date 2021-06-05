package Clases;

// Hecho por: Betsy Vargas

public class Curso {
	private int codCurso;
	private String descripcion;
	private String enlace;
	private Profesor profesor;
	
	public Curso(int codCurso, String descripcion, String enlace, Profesor profesor) {
		this.codCurso = codCurso;
		this.descripcion = descripcion;
		this.enlace = enlace;
		this.profesor = profesor;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", descripcion=" + descripcion + ", enlace=" + enlace + ", profesor="
				+ profesor + "]";
	}
}

