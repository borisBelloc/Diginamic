package fr.diginamic.tpSpringSecurity.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.tpSpringSecurity.exception.AlreadyExistsException;
import fr.diginamic.tpSpringSecurity.exception.NotFoundException;
import fr.diginamic.tpSpringSecurity.models.User;
import fr.diginamic.tpSpringSecurity.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// @GetMapping <- peut remplacer le requestMethod.GET
	@RequestMapping(method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('READ_USERS')")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('READ_USERS')")
	public User findById(@PathVariable Long id) throws NotFoundException {
		return userService.findById(id);
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('CREATE_USERS')")
	public User create(@RequestBody User user) throws AlreadyExistsException {
		return userService.create(user);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasAuthority('DELETE_USERS')")
	public User delete(@PathVariable Long id) throws NotFoundException {
		return userService.delete(id);
	}

	/**
	 * Verifie que le changement de mot de passe est effectué par un Admin ou pas le possesseur du compte  
	 */
	@PutMapping("/{id}/password")
	@PreAuthorize("hasRole('ADMIN') or @securityExpression.isConnectedUser(#id, #principal)")
	public void changePassword(@PathVariable Long id, @RequestParam String password, Principal principal) throws NotFoundException {
		userService.changePassword(id, password);
	}
	
//	Request to change password
	
	// ? -> @RequestParam
	// Si 2 @RequestParam  -> ?xxxx=yyyy&uuuu=zzzz
	// localhost:8080/api/users/2/password?password=coucou
}
