package fr.diginamic.tp8510_SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

import fr.diginamic.tp8510_SpringJDBC.exception.EmployeeNotFoundException;
import fr.diginamic.tp8510_SpringJDBC.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	// @Qualifier("employeeJdbcRepository")
	// si on avait plusieurs classe qui implémenté l'interface, on utiliserait @Qualifier pour preciser qui prendre
	private EmployeeRepository employeeRepository;
	// ^ equivalent a :
//	private EmployeeRepository employeeRepository = new EmployeeJdbcRepository();; 

	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Transactional
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

//	@Transactional
//	public Employee find(long id) {
//		return employeeRepository.find(id);
//	}
	
	@Transactional
	public Employee findBySsn(String ssn) {
		return employeeRepository.findBySsn(ssn);
	}

//	public void update(Employee employee) {
//		employeeRepository.update(employee);
//	}

	@Transactional
	public void delete(Long employeeId) {
		employeeRepository.delete(employeeId);
	}

	@Transactional
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
	}

	@Deprecated
	@Transactional
	public void saveAll(List<Employee> listeEmployes) {
		for (Employee employee : listeEmployes) {
			employeeRepository.save(employee);
		}
	}

	// Ajouter une méthode qui met à jour une liste d’utilisateurs
	// et faire un rollback si un des utilisateurs de la liste n’existe pas


	@Transactional(rollbackFor = EmployeeNotFoundException.class)
	public void update(Employee employee) throws EmployeeNotFoundException {
		employeeRepository.update(employee);
	}
	
	@Transactional(rollbackFor = EmployeeNotFoundException.class)
	public void updateList(List<Employee> listEmployee) throws EmployeeNotFoundException {
		for (Employee employee : listEmployee) {
			if (employee.getId() == 0 ) {
				throw new EmployeeNotFoundException(employee.getId());
			}
			System.out.println("VERIF ID :: " + employee.getId());
			employeeRepository.update(employee);
		}
	}



	
}