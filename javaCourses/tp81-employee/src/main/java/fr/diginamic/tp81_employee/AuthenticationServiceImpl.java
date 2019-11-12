package fr.diginamic.tp81_employee;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationServiceImpl implements AuthenticationService {
	

	
	public boolean authenticate(String login, String password) {
		System.out.println("connecting...");
	    
		return false;
	}
	
	
	private void connectedOk() {
		System.out.println("Connected, welcome alber");
	}

	
}
