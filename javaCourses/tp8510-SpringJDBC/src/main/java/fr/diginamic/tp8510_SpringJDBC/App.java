package fr.diginamic.tp8510_SpringJDBC;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import fr.diginamic.tp8510_SpringJDBC.dao.EmployeeJdbcRepository;
import fr.diginamic.tp8510_SpringJDBC.model.Employee;


@Configuration
@ComponentScan
public class App {
    public static void main(String[] args)    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    	EmployeeJdbcRepository req1 = context.getBean(EmployeeJdbcRepository.class);
    	
    	Employee e1 = new Employee();
    	e1.setFirstname("Boris");
    	e1.setHiredate(LocalDate.now());
    	e1.setLastname("Belloc");
    	e1.setSalary(new BigDecimal(1000));
    	e1.setSsn("1758504");
    	
    	req1.save(e1);
    	
    	System.out.println("----------");
    	System.out.println(req1.findAll());
    	System.out.println("----------");
    	req1.deleteAllEmployees();
    	System.out.println(req1.findAll());
    	
    	
    }
}
