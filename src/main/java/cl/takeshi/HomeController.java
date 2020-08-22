package cl.takeshi;

import java.net.URI;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cl.takeshi.beans.Alumno;
import cl.takeshi.beans.Curso;
import cl.takeshi.dao.DAOalumnos;
import cl.takeshi.dao.DAOcursos;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	DAOcursos cursosDAO;

	@Autowired
	DAOalumnos alumnosDAO;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView listadoDeCursos(HttpServletRequest request, ModelMap model) {
		System.out.println("lista cursos");
		model.addAttribute("cursos", cursosDAO.listacursos());	
		return new ModelAndView("cursos", "model", model);
		}
	
	@RequestMapping(value="/alumnos/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Alumno> alumnosByIdRest(@PathVariable int id){
		List<Alumno> listaalum = alumnosDAO.alumnobycurso(id);
		return listaalum;
	}
	
	@RequestMapping(value="/lista/{id}", method = RequestMethod.GET)
	public ModelAndView alumnosByIdJsp(@PathVariable int id,HttpServletRequest request, ModelMap model) {
		System.out.println("Rest "+ id);
		
		final String uri = "http://localhost:8081/simulacion3/alumnos/"+id;
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<List<Alumno>> postResponse = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Alumno>>() {});
		List<Alumno> listaalum = postResponse.getBody();
	    
	    
		model.addAttribute("alumnos", listaalum);
		
		return new ModelAndView("alumnos", "model", model);
	}
	
	
	

}
