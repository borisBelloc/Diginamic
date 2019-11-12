package fr.diginamic.tp81_employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

    	System.out.println("Start");
    	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AuthenticationService auth = context.getBean(AuthenticationService.class);
		System.out.println("AUTHENTIFICATION : " + auth.authenticate("papa", "toto"));

		
    	
    	
    }
}
