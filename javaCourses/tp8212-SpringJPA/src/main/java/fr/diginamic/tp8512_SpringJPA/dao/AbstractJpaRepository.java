package fr.diginamic.tp8512_SpringJPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractJpaRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public void persist(Object entity) {
		entityManager.persist(entity);
	}

	protected void update(Object entity) {
		entityManager.merge(entity);
	}
	
	protected void delete(Object entity) {
		entityManager.remove(entity);
	}
	
}
