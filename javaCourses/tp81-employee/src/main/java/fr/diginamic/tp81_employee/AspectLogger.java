package fr.diginamic.tp81_employee;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {

	// sur toutes les methodes de n'importe quelle classe qui a son nom débutant par get 
	@After("execution(* get*(..) )")
	public void afterGetMethod() {
		System.out.println("LOG APRES UN GET");

	}
	
	// sur toutes les methodes
	@Before("execution(* *(..))")
	public void decoratorForAll(JoinPoint jp) {
		// Rajouter en premier paramètre de l’advice l’objet de type
		// JoinPoint donne acces a :
		// getArgs(), getThis(), getSignature(), getTarget()
		System.out.println("------------------");
		System.out.println("Décorator nom méthode : " + jp.getSignature().getName());
	}
	
	@AfterThrowing( pointcut="execution(* saveDummy(..))", throwing="error" )
	// doc : https://www.tutorialspoint.com/springaop/springaop_after_throwing1.htm
	public void releveExeption(JoinPoint jp, Throwable error) {
		System.out.println("ERREUR DETECTED DECORATOR:: " + error + "::/FIN DECORATOR\n");
	}
	
//	@Around("saveDummy()")
	@Around("execution(* fr.diginamic.tp81_employee.DummyService.saveDummy(..))")
	public Object chronoSaveFunction(ProceedingJoinPoint pjp) throws Throwable {
		
		long timeStart = System.currentTimeMillis();
		System.out.println("temps avant : " + timeStart);
		TimeUnit.SECONDS.sleep(1);
		
        Object returnedValue = pjp.proceed();
        
        long timeFinish = System.currentTimeMillis();
        System.out.println("CHRONO -> Temps apres Timing process is : " + ( timeFinish - timeStart ) + " MilliSeconds ");
        
        return returnedValue;
		
	}

//	@Around("execution(* aop.DummyService.saveDummy(..))")
//    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
//        
//		long timeStart = System.currentTimeMillis();
//        System.out.println(" Before calling pjp ");
//        
//        TimeUnit.SECONDS.sleep(1);
//        Object returnedValue = pjp.proceed();
//        
//        long timeFinish = System.currentTimeMillis();
//        
//        System.out.println(" After calling pjp " + " Timing process is : " + ( timeFinish - timeStart ) + " MilliSeconds ");
//        
//        return returnedValue;
//    }
	
	

}
