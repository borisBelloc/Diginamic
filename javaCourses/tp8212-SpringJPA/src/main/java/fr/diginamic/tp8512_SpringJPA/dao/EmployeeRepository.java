package fr.diginamic.tp8512_SpringJPA.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.diginamic.tp8512_SpringJPA.exception.EmployeeNotFoundException;
import fr.diginamic.tp8512_SpringJPA.model.Employee;

@Repository
public interface EmployeeRepository {
	
	public void save(Employee employee);
	public List<Employee> findAll();
	
//	public Employee find(long id);
	public Employee findBySsn(String ssn);
	
	public void update(Employee employee) throws EmployeeNotFoundException;
	
	public void delete(Long employeeId);
	public void deleteAllEmployees();

}
