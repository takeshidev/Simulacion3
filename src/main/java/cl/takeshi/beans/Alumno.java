package cl.takeshi.beans;

public class Alumno {

	private int idalumno;
	private int idcurso;
	private String nombre;
	private String curso;



	public Alumno() {
		super();
	}
	
	public Alumno(int idalumno, int idcurso, String nombre, String curso) {
		super();
		this.idalumno = idalumno;
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.curso = curso;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
		
}
