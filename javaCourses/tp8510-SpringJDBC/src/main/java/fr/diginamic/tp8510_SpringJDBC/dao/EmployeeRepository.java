package fr.diginamic.tp8510_SpringJDBC.dao;

import java.util.List;

import fr.diginamic.tp8510_SpringJDBC.model.Employee;

public interface EmployeeRepository {
	
	public void save(Employee employee);
	public List<Employee> findAll();
	
	public Employee findBySsn(String ssn);
	public void update(Employee employee);
	
	public void delete(Long employeeId);
	public void deleteAllEmployees();

}
