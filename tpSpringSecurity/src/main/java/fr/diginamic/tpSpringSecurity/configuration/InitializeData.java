package fr.diginamic.tpSpringSecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import fr.diginamic.tpSpringSecurity.models.Right;
import fr.diginamic.tpSpringSecurity.models.Role;
import fr.diginamic.tpSpringSecurity.models.User;
import fr.diginamic.tpSpringSecurity.repository.RightJpaRepository;
import fr.diginamic.tpSpringSecurity.repository.RoleJpaRepository;
import fr.diginamic.tpSpringSecurity.repository.UserJpaRepository;

@Configuration
public class InitializeData {
	
	@Autowired
	private UserJpaRepository userRepository;
	
	@Autowired
	private RightJpaRepository rightRepository;
	
	@Autowired
	private RoleJpaRepository roleRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void start() {
		
		// Right Creation
		Right readUsers = new Right("READ_USERS");
		Right createUsers = new Right("CREATE_USERS");
		Right deleteUsers = new Right("DELETE_USERS");
		
		rightRepository.save(readUsers);
		rightRepository.save(createUsers);
		rightRepository.save(deleteUsers);
		
		// Role Creation
		Role admin = new Role("ADMIN");
		admin.addRight(readUsers);
		admin.addRight(createUsers);
		admin.addRight(deleteUsers);
		
		Role moderator = new Role("MODERATOR");
		moderator.addRight(readUsers);
		moderator.addRight(createUsers);
		
		Role user = new Role("USER");
		moderator.addRight(readUsers);
		
		roleRepository.save(admin);
		roleRepository.save(moderator);
		roleRepository.save(user);
		
		// User Creation
		User adminUser = new User("admin", "password", "Jean-Luc", "Adminne", "jl.admine@gmail.com", admin);
		User modoUser = new User("modo", "password", "Paul", "Alto", "palto@gmail.com", moderator);
		User userClassicUser = new User("user", "password", "Alexis", "Baton", "baton@gmail.com", user);
		
		userRepository.save(adminUser);
		userRepository.save(modoUser);
		userRepository.save(userClassicUser);
		
	}
	
	

}
