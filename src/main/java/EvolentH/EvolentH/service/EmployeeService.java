package EvolentH.EvolentH.service;

import java.util.List;

import org.springframework.stereotype.Service;

import EvolentH.EvolentH.Models.Employee;

@Service
public interface EmployeeService {
	
	 List<Employee> getUsers();

	 int addEmployee(Employee emp) ;

	int deleteEmployee(int id);

	int editEmployee(Employee emp);

	int activateEmployee(int id);
	
}
