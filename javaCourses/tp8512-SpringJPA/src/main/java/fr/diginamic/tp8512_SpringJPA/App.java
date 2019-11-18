package fr.diginamic.tp8512_SpringJPA;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.diginamic.tp8512_SpringJPA.dao.EmployeeJdbcRepository;
import fr.diginamic.tp8512_SpringJPA.dao.EmployeeService;
import fr.diginamic.tp8512_SpringJPA.exception.EmployeeNotFoundException;
import fr.diginamic.tp8512_SpringJPA.model.Employee;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class App {
	public static void main(String[] args) throws EmployeeNotFoundException {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		// context sans transaction
		// EmployeeJdbcRepository req1 = context.getBean(EmployeeJdbcRepository.class);

		// context avec transaction
		EmployeeService requestTransaction1 = context.getBean(EmployeeService.class);

		requestTransaction1.deleteAllEmployees();

		Employee e1 = new Employee();
		e1.setFirstname("TRUDEAU");
		e1.setHiredate(LocalDate.now());
		e1.setLastname("Belloc");
		e1.setSalary(new BigDecimal(1000));
		e1.setSsn("1758504");

		requestTransaction1.save(e1);

//		requestTransaction1.deleteEmployee(e1);
		
		
		System.out.println("----------");
		System.out.println(requestTransaction1.findAll());
//    	System.out.println(req1.findAll());
		System.out.println("----------");

		// Retrouver e1 pour recup son id de la BDD :
//		Employee sE1 = requestTransaction1.findBySsn("1758504");

//		Employee e2 = new Employee();
//		e2.setFirstname("Elisa");
		// modif son nom
		
//		sE1.setFirstname("BOF");
		
//		List<Employee> listEmployee = Arrays.asList(sE1, e2);
//		List<Employee> listEmployee = Arrays.asList(sE1);

//		try {
//			System.out.println("dans le try");
//			requestTransaction1.updateList(listEmployee);
//		} catch (EmployeeNotFoundException e) {
//			System.out.println("Exception 404 :: " + e);
//		}

//		requestTransaction1.update(e2);	

		System.out.println("----------");
//		Employee e3 = new Employee();
//		e3.setFirstname("Emilie");

//		Employee e4 = new Employee();
//    	requestTransaction1.saveAll(listEmployee);

//		System.out.println("------FIN----");
//		System.out.println(requestTransaction1.findAll());


	}

}
