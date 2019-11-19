package fr.diginamic.tp8330_SpringMvc.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.diginamic.tp8330_SpringMvc.model.User;

@Repository
public class UserRepository extends AbstractJpaRepository<User> {

	protected UserRepository(Class<User> type) {
		super(type);
	}

	
	public User findOneByLogin(String login) {
		String qlString = "from User u where u.login = :login";
		TypedQuery<User> query = entityManager.createQuery(qlString, User.class);
		query.setParameter("login", login);
		return query.getSingleResult();
	}
	
	
//	TODO: faire les methodes avec les actions
//	public User save(User user) {
////		return entityManager.find(type, login);
//		return user;
//	}

	
	
	
	
}
