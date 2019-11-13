package fr.diginamic.tp81_employee;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {

	// sur toutes les methode de n'importe quelle classe qui a son nom débutant par get 
	@After("execution(* get*(..) )")
	public void afterGetMethod() {
		System.out.println("LOG APRES UN GET");

	}

//	@Component
//	@Aspect
//	public class LogInvocation {
//	@Around execution (* fr.iocean .*Service.*(..))"
//
//		public void logService() {
//			System.out.println("Service method has been called");
//		}
//	}

}
