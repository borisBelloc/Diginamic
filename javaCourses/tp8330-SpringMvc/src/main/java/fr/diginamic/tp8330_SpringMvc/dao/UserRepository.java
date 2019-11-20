package fr.diginamic.tp8330_SpringMvc.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.diginamic.tp8330_SpringMvc.model.User;

@Repository
@Transactional
public class UserRepository extends AbstractJpaRepository<User> {

	protected UserRepository(Class<User> type) {
		super(type);
//		super(User.class);
	}

	
	public User findOneByLogin(String login) {
		String qlString = "from User u where u.login = :login";
		TypedQuery<User> query = entityManager.createQuery(qlString, User.class);
		query.setParameter("login", login);
		return query.getSingleResult();
	}
	
	

	public User save(User user) {
		entityManager.persist(user);
		return user;
	}

//	TODO: faire les methodes avec les actions
	
	
	
	
}
