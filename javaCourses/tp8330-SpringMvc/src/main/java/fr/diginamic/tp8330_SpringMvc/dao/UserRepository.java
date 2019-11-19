package fr.diginamic.tp8330_SpringMvc.dao;

import org.springframework.stereotype.Repository;

import fr.diginamic.tp8330_SpringMvc.model.User;

@Repository
public class UserRepository extends AbstractJpaRepository<User> {

	protected UserRepository(Class<User> type) {
		super(type);
	}

	public User findOneByLogin(String login) {
		return entityManager.find(type, login);
	}

	
	
	
	
}
