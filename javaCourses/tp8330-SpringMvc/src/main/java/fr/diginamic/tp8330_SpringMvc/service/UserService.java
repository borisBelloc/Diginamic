package fr.diginamic.tp8330_SpringMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.tp8330_SpringMvc.dao.UserRepository;
import fr.diginamic.tp8330_SpringMvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User update(User user) {
		return userRepository.update(user);
	}

	public User find(Long id) {
		return userRepository.find(id);
	}

	public User delete(Long id) {
		return userRepository.delete(id);
	}
}
