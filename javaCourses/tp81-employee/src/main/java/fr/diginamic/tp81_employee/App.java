package fr.diginamic.tp81_employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class App {
	public static void main(String[] args) {

		System.out.println(">Start");

		// TP 81 XML
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AuthenticationService auth = context.getBean(AuthenticationService.class);
//		System.out.println("AUTHENTIFICATION : " + auth.authenticate("papa", "toto"));

//		Thread.sleep(3000L);

		// TP 81 Annotation
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AuthenticationService auth = context.getBean(AuthenticationService.class);

		// les bean sont par annotation
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		DummyService service = context.getBean(DummyService.class);

//		DummyService d1 = new DummyService();
		System.out.println(service.getDummies());

		// Double sauvegarde pour lancer l'exception
		Dummy manu = new Dummy(15L, "n�" + 75);
		try {
			service.saveDummy(manu);
		} catch (DummyAlreadyExistsException e) {
			e.printStackTrace();
		}
		// décomenter pour erreur
//		try {
//			service.saveDummy(manu);
//		} catch (DummyAlreadyExistsException e) {
//			e.printStackTrace();
//		}
//		


		System.out.println(">End");
		// System.currentTimeMillis()
		
		

	}
}
