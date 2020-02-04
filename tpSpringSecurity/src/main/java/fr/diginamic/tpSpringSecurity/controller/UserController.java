package fr.diginamic.tpSpringSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) throws NotFoundException {
		return userService.findById(id);
	}
	
	@PostMapping
	public User create(@RequestBody User user) throws AlreadyExistsException {
		return userService.create(user);
	}
	
	@DeleteMapping("/{id}")
	public User delete(@PathVariable Long id) throws NotFoundException {
		return userService.delete(id);
	}

	

}
