package fr.diginamic.tpSpringSecurity.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
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
//		String encodedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
		encodePassword(user);
		
		return userRepository.save(user);
	}
	
	public User changePassword(Long id, String password) throws NotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("User doesn't exist. (id = " + id + ")"));
		user.setPassword(password);
		encodePassword(user);
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
	
	/**
	 * Encodes the password of the given user and store it in the user
	 * @param user The user
	 */
	private void encodePassword(User user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
	}
}
