package dao;

import javax.persistence.EntityManager;

import database.DatabaseHelper;

public class dao {
	
	/**
	 * Save 0, n new object(s) to database
	 * @param obj
	 */
	public static void saveNewObjectToDb(Object... obj) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		for (Object o : obj) {
		em.persist(o);		
		}
		DatabaseHelper.commitTxAndClose(em);
	}
	


}
