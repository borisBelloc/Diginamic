package fr.diginamic.tp8330_SpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import fr.diginamic.tp8330_SpringMvc.model.User;
import fr.diginamic.tp8330_SpringMvc.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestBody User user) {
		userService.update(user);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public User find(@PathVariable Long id) {
		return userService.find(id);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public User delete(@PathVariable Long id) {
		return userService.delete(id);
	}
}