package fr.diginamic.tpSpringSecurity.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.diginamic.tpSpringSecurity.models.User;

@Repository
public interface UserJpaRepositoryCustom {
	
	public List<User> searchUser(String nickname, String email, String firstName, String lastName);
	
}