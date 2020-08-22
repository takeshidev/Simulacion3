package cl.takeshi.beans;

public class Curso {

	private int idcurso;
	private String nombre;
	private int numalum;

	
	public Curso() {
		super();
	}

	public Curso(int idcurso, String nombre, int numalum) {
		super();
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.numalum = numalum;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumalum() {
		return numalum;
	}

	public void setNumalum(int numalum) {
		this.numalum = numalum;
	}
		
}
