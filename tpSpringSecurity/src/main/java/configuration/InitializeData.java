package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import fr.diginamic.tpSpringSecurity.models.Right;
import repository.RightJpaRepository;

@Configuration
public class InitializeData {
	
	@Autowired
	private RightJpaRepository rightRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void start() {
		Right readUsers = new Right("READ_USERS");
		Right createUsers = new Right("CREATE_USERS");
		Right deleteUsers = new Right("DELETE_USERS");
		
//		rightRepository.save(entity);
	}
	
	

}
