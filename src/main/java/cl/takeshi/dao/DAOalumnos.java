package cl.takeshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.beans.Alumno;

public class DAOalumnos {

	private String SQL_ALUMNOS = "SELECT alumno.idalumno, alumno.idcurso, alumno.nombre, curso.nombre AS curso FROM alumno INNER JOIN curso ON alumno.idcurso = curso.idcurso WHERE alumno.idcurso =";
	private String where = "";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public List<Alumno> alumnobycurso(int id){
		return template.query(SQL_ALUMNOS+id, new AlumnoMapper());
	}
	
	public class AlumnoMapper implements RowMapper<Alumno>{
		public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Alumno(
					rs.getInt("idalumno"),
					rs.getInt("idcurso"),
					rs.getString("nombre"),
					rs.getString("curso")
					);
		}
	}
	
	
	
}
