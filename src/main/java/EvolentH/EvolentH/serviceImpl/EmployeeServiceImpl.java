package EvolentH.EvolentH.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EvolentH.EvolentH.Models.Employee;
import EvolentH.EvolentH.config.ApplicationLogger;
import EvolentH.EvolentH.dao.EmployeeDao;
import EvolentH.EvolentH.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public List<Employee> getUsers() {
		ApplicationLogger.info("Inside Service class");

		return empDao.getUser();
	}

	@Override
	public int addEmployee(Employee emp) {
		emp.setStatus(true);
		return empDao.addUser(emp);
	}

	@Override
	public int deleteEmployee(int id) {
		return empDao.deleteEmployee(id);
	}

	@Override
	public int editEmployee(Employee emp) {
		return empDao.editEmployee(emp);
	}

	@Override
	public int activateEmployee(int id) {
		return empDao.activateEmployee(id);
	}

}
