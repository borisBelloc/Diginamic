package fr.diginamic.tp8510_SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

import fr.diginamic.tp8510_SpringJDBC.exception.EmployeeNotFoundException;
import fr.diginamic.tp8510_SpringJDBC.model.Employee;

@Service
@Transactional
public class EmployeeJdbcService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee findBySsn(String ssn) {
		return employeeRepository.findBySsn(ssn);
	}

//	public void update(Employee employee) {
//		employeeRepository.update(employee);
//	}

	public void delete(Long employeeId) {
		employeeRepository.delete(employeeId);
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
	}

	@Deprecated
	public void saveAll(List<Employee> listeEmployes) {
		for (Employee employee : listeEmployes) {
			employeeRepository.save(employee);
		}
	}

	// Ajouter une méthode qui met à jour une liste d’utilisateurs
	// et faire un rollback si un des utilisateurs de la liste n’existe pas
//		TODO: faire methode updateAll(
//	public void updateEmployee(Employee employee) {
//		String sqlQuery = "UPDATE employee SET firstname = ?, lastname = ?, hiredate = ?, salary = ?, ssn = ? WHERE id = ?";
//		employeeRepository.update(sqlQuery, employee.getFirstname(), employee.getLastname(), employee.getHiredate(),
//				employee.getSalary(), employee.getSsn(), employee.getId());
//	}

	@Transactional(rollbackFor = EmployeeNotFoundException.class)
	public void update(Employee employee) throws EmployeeNotFoundException {
		employeeRepository.update(employee);
	}

	
}