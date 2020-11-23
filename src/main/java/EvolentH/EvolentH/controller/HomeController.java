package EvolentH.EvolentH.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import EvolentH.EvolentH.Models.Employee;
import EvolentH.EvolentH.config.ApplicationLogger;
import EvolentH.EvolentH.config.HibernateUtil;
import EvolentH.EvolentH.service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		  ApplicationLogger.info("on homepage");  
		
	
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/list")
	public @ResponseBody  List < Employee >   getSEmployees(HttpServletResponse response) throws IOException{
		return empService.getUsers();
	}
	
	@RequestMapping(value="/add")
	public @ResponseBody  int  AddEmployee(HttpServletResponse response,  Employee emp) throws IOException{
		return empService.addEmployee(emp);
	}
	
	@RequestMapping(value="/delete")
	public @ResponseBody  int  deleteEmployee(HttpServletResponse response,  int id) throws IOException{
		return empService.deleteEmployee(id);
	}
	@RequestMapping(value="/activate")
	public @ResponseBody  int  activateEmployee(HttpServletResponse response,  int id) throws IOException{
		return empService.activateEmployee(id);
	}
	@RequestMapping(value="/edit")
	public @ResponseBody  int  editEmployee(HttpServletResponse response,  Employee emp) throws IOException{
		return empService.editEmployee(emp);
	}
}
