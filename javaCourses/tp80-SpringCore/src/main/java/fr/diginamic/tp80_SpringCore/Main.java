package fr.diginamic.tp80_SpringCore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main started");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Context loaded");
		
		// Creation premier objet
		MyObject objA = (MyObject)context.getBean("myobjA");
		System.out.println("Object : " + objA);
		
		
		MyObject objB = (MyObject)context.getBean("myobjB");
		System.out.println("Object : " + objB.getParent().getId());
		System.out.println("Object : " + objA.getName() + " " + objA.getKeywords());
		
	}

}
