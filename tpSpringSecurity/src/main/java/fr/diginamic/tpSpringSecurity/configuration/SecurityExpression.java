package fr.diginamic.tpSpringSecurity.configuration;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.tpSpringSecurity.exception.NotFoundException;
import fr.diginamic.tpSpringSecurity.models.User;
import fr.diginamic.tpSpringSecurity.service.UserService;

/**
 * VERIFIE QUE L'utilisateur connecté ai le droit de modifier le password
 * @author formation
 *
 */

@Service
public class SecurityExpression {

	private static final Logger LOG = LoggerFactory.getLogger(SecurityException.class);

	@Autowired
	private UserService userService;

	// Principal -> l'utilisateur connecté
	public boolean isConnectedUser(Long id, Principal principal) {
		boolean authorized = false;

		try {
			User user = userService.findById(id);
			authorized = user.getNickname().equals(principal.getName());

		} catch (NotFoundException e) {
		}

		if (!authorized) {
			LOG.warn("Malicious attempts to modify a password (connected : " + principal.getName() + ", victim : " + id);
		}
		return authorized;
	}

}
