package dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import database.DatabaseHelper;
import models.Avion;
import models.Vol;
import reservol.Display;

public class dao_vol {
	
	
	/**
	 * Création d’un vol
	 * Un vol est composé des informations suivantes :
	 * - Numéro de vol (Unique, doit être de 4 caractères, peut se présenter de la forme “0001”)
 	 * - Type d’avion (A330, A340, A380, B747)
	 * - Nombre de place
	 * - Ville de départ
	 * - Ville d’arrivée
     * - Date de départ
	 */
	public static Vol createVol(String numero_vol, Avion avion, int nombre_place,
								String ville_depart, String ville_arrive,
								LocalDate date_depart ) {
		Vol vol = new Vol(numero_vol, avion, nombre_place, ville_depart, ville_arrive, date_depart);
		return vol;
		
	}

	/**
	 * Obtenir tous les vols existants
	 * @return List<Vol>
	 */
	public static List<Vol> searchAllVol() {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		TypedQuery<Vol> query = em.createQuery("from Vol", Vol.class);
		List<Vol> vols = query.getResultList();
		DatabaseHelper.commitTxAndClose(em);
		//---------------------------------------
		// TODO: envoyer la liste de Vol dans Display pour affichage
		
		// TODO : format ajout space avant apres trim inversé
		// TODO : truncate ville trop longue ?
		System.out.print("\n");
		Display.enteteVols();
		for (Vol v : vols) {
			System.out.print(v.getNumero_vol());
			System.out.print("    ");
			System.out.print(v.getAvion());
			System.out.print("    ");
			System.out.print("xx/xx");
			System.out.print("   ");
			System.out.print(v.getVille_depart());
			System.out.print("      ");
			System.out.print(v.getVille_arrive());
			System.out.print("    ");
			System.out.print(v.getDate_depart());
			System.out.print("\n");
		}
		return vols;
	}
	
	/**
	 * Rechercher un avion par numéro
	 * @return Vol
	 */
	public static Vol searchOneVol(String numeroVol) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		TypedQuery<Vol> query = em.createQuery("from Vol v where v.numero_vol =:numVol", Vol.class);
		query.setParameter("numVol", numeroVol);
		Vol v = query.getSingleResult();
		DatabaseHelper.commitTxAndClose(em);
		//---------------------------------------
		// TODO: envoyer la liste de Vol dans Display pour affichage
		System.out.print("\n");
		Display.enteteVols();
		System.out.print(v.getNumero_vol());
		System.out.print("    ");
		System.out.print(v.getAvion());
		System.out.print("    ");
		System.out.print("xx/xx");
		System.out.print("   ");
		System.out.print(v.getVille_depart());
		System.out.print("      ");
		System.out.print(v.getVille_arrive());
		System.out.print("    ");
		System.out.print(v.getDate_depart());
		System.out.print("\n");
		return v;
	}

	public static List<Vol> searchVolByCities (String ville_depart, String ville_arrive) {
		EntityManager em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		
		TypedQuery<Vol> query = em.createQuery("from Vol v where "
				+ "v.ville_depart =:villDepart AND v.ville_arrive =:villArrive"
				, Vol.class);
		query.setParameter("villDepart", ville_depart);
		query.setParameter("villArrive", ville_arrive);
		List<Vol> vols = query.getResultList();
		DatabaseHelper.commitTxAndClose(em);
		//---------------------------------------
		// TODO: envoyer la liste de Vol dans Display pour affichage
		Display.enteteVols();
		for (Vol v : vols) {
			System.out.print(v.getNumero_vol());
			System.out.print("    ");
			System.out.print(v.getAvion());
			System.out.print("    ");
			System.out.print("xx/xx");
			System.out.print("   ");
			System.out.print(v.getVille_depart());
			System.out.print("      ");
			System.out.print(v.getVille_arrive());
			System.out.print("    ");
			System.out.print(v.getDate_depart());
			System.out.print("\n");
		}
		return vols;
	}
	
}
