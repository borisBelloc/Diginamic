package fr.diginamic.tpSpringSecurity.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.tpSpringSecurity.exception.AlreadyExistsException;
import fr.diginamic.tpSpringSecurity.models.User;
import fr.diginamic.tpSpringSecurity.repository.UserJpaRepository;
import fr.diginamic.tpSpringSecurity.exception.NotFoundException;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserJpaRepository userRepository;
	
	public User findById(Long id) throws NotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User doesn't exist. (id = " + id + ")"));
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User create(User user) throws AlreadyExistsException {
		if (user.getId() != null) {
			throw new AlreadyExistsException("Can't save. User has an id : " + user.getId());
		}
		return userRepository.save(user);
	}
	
	public User delete(Long id) throws NotFoundException {
		User baseUser = userRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("User doesn't exist. (id = " + id + ")"));
		userRepository.deleteById(id);
		return baseUser;
	}
	
	public List<User> search(String nickname, String email, String firstName, String lastName) {
		return userRepository.searchUser(nickname, email, firstName, lastName);
	}
}
