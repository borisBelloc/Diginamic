package fr.diginamic.tp8330_SpringMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.diginamic.tp8330_SpringMvc.dao.UserRepository;
import fr.diginamic.tp8330_SpringMvc.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findOneByLogin(String login) {
		return userRepository.findOneByLogin(login);
	}
	
	@Transactional(readOnly = false)
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Deprecated
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Deprecated
	public User update(User user) {
		return userRepository.update(user);
	}
	
	@Deprecated
	public User find(Long id) {
		return userRepository.find(id);
	}
	
	@Deprecated
	public User delete(Long id) {
		return userRepository.delete(id);
	}
	

}
