package fr.diginamic.tp8510_SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	public void update(Employee employee) {
		employeeRepository.update(employee);
	}

	public void delete(Long employeeId) {
		employeeRepository.delete(employeeId);		
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
	}
	
	// Ajouter une méthode qui met à jour une liste d’utilisateurs 
	// et faire un rollback si un des utilisateurs de la liste n’existe pas
	public void saveAll(List<Employee> listeEmployes) {
		for(Employee employee : listeEmployes) {
			employeeRepository.save(employee);
		}
		
	}
}