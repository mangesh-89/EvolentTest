package EvolentH.EvolentH.dao;

import java.util.List;

import EvolentH.EvolentH.Models.Employee;

public interface EmployeeDao {

	int addUser(Employee emp);

	int editEmployee(Employee emp);

	int deleteEmployee(int id);

	List<Employee> getUser();

	int activateEmployee(int id);

}
