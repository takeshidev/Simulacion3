package cl.takeshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.takeshi.beans.Curso;

public class DAOcursos {

	private String SQL_CURSOS = "SELECT curso.idcurso, curso.nombre, COUNT(alumno.idalumno) AS numalum FROM alumno INNER JOIN curso ON alumno.idcurso = curso.idcurso GROUP BY curso.idcurso, curso.nombre";
	
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Curso> listacursos(){
		return template.query(SQL_CURSOS, new CursoMapper());
	}
	
	
	
	public class CursoMapper implements RowMapper<Curso>{
		public Curso mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Curso(
					rs.getInt("idcurso"),
					rs.getString("nombre"),
					rs.getInt("numalum")
					);
		}
	}
}
