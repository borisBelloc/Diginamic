package fr.diginamic.tp8510_SpringJDBC;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import fr.diginamic.tp8510_SpringJDBC.dao.EmployeeJdbcRepository;
import fr.diginamic.tp8510_SpringJDBC.dao.EmployeeJdbcService;
import fr.diginamic.tp8510_SpringJDBC.exception.EmployeeNotFoundException;
import fr.diginamic.tp8510_SpringJDBC.model.Employee;

@Configuration
@ComponentScan
public class App {
	public static void main(String[] args) throws EmployeeNotFoundException {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		// context sans transaction
		// EmployeeJdbcRepository req1 = context.getBean(EmployeeJdbcRepository.class);

		// context avec transaction
		EmployeeJdbcService requestTransaction1 = context.getBean(EmployeeJdbcService.class);

		requestTransaction1.deleteAllEmployees();
		
		Employee e1 = new Employee();
		e1.setFirstname("Boris");
		e1.setHiredate(LocalDate.now());
		e1.setLastname("Belloc");
		e1.setSalary(new BigDecimal(1000));
		e1.setSsn("1758504");

//    	req1.saveOneEmployee(e1);
		requestTransaction1.save(e1);

		System.out.println("----------");
		System.out.println(requestTransaction1.findAll());
//    	System.out.println(req1.findAll());
		System.out.println("----------");
//    	req1.deleteAllEmployees(); 
//		requestTransaction1.deleteAllEmployees();
//    	System.out.println(req1.findAll());
//		System.out.println(requestTransaction1.findAll());

		// Retrouver e1 pour recup son id de la BDD :
		Employee sE1 = requestTransaction1.findBySsn("1758504");
		
		// modif son nom
		sE1.setFirstname("BOB");
		requestTransaction1.update(sE1);	

		
		System.out.println("----------");
//		Employee e2 = new Employee();
//		e2.setFirstname("Elisa");
//		Employee e3 = new Employee();
//		e3.setFirstname("Emilie");
		
//		Employee e4 = new Employee();
//		List<Employee> listEmployee = Arrays.asList(e2, e3);
//    	requestTransaction1.saveAll(listEmployee);
		
    	System.out.println("----------");
    	System.out.println(requestTransaction1.findAll());
    	
	}

}
