package fr.diginamic.tp81_employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

    	System.out.println("Start");
    	
//		System.out.println("Context loaded");
		
		
		AbstractApplicationContext interf1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AuthenticationService asi = interf1.getBean(AuthenticationService.class);

		asi.authenticate("alber", "22");
		
    	
    	
    }
}
