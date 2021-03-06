package reservol;

import java.time.LocalDate;
import java.util.Scanner;

import dao.dao;
import dao.dao_vol;
import models.Avion;
import models.Vol;

public class Program {

	public static void start() {
		Display.Start();

		int userChoice = Utils.isUserInputOk(1);

		switch (userChoice) {
		case 1:
			menuVols();
			break;
		case 2:
			menuResas();
			break;
		case 3:
			Display.quitter();
			break;

		default:
			System.out.println("Error Program.java line22");
			break;
		}
	}

	/**
	 * 1: Création d’un vol 
	 * 2: Liste des vols 
	 * 3: Rechercher un avion par numéro 
	 * 4: Rechercher un avion par ville de départ et d’arrivée
	 */
	public static void menuVols() {
		Display.gestionVols();
		int userChoice = Utils.isUserInputOk(2);

		switch (userChoice) {
		case 1:
			System.out.println("Numéro de vol");
			Scanner sc = new Scanner(System.in); 
			String numVol = "";
			do { 
				System.out.println("Attention, le numéro de vol doit faire 4 charactères :");
				numVol = sc.nextLine();
			} while (numVol.length() != 4);
			
			System.out.println("Type d'avion :");
			System.out.println("Les choix : A330; A340; A380; B747;");
			String typeAvion = sc.nextLine();

			System.out.println("Nombre de places :");
			int nbrPlace = sc.nextInt();
			
			System.out.println("Ville de départ :");
			String villDepart = sc.nextLine();
			sc.next();
			System.out.println("Ville d'arrivée :");
			String villArrive = sc.nextLine();
			sc.next();

			// annee
			System.out.println("Année de départ:");
			int annee = sc.nextInt();
			System.out.println("Mois de départ:");
			int mois = sc.nextInt();
			System.out.println("Jour de départ:");
			int jour = sc.nextInt();
			LocalDate dateDepart = LocalDate.of(annee, mois, jour);

			Vol volClient = dao_vol.createVol(numVol, Avion.valueOf(typeAvion), nbrPlace, villDepart, villArrive, dateDepart);
			dao.saveNewObjectToDb(volClient);
			sc.close();
			
			break;
		case 2:
			dao_vol.searchAllVol();
			break;
		case 3:
			System.out.println("Rechercher un vol par son numéro; entrez le numéro :");
			Scanner sc2 = new Scanner(System.in); 
			String numeroVol = sc2.next();
			dao_vol.searchOneVol(numeroVol);
			sc2.close();
			break;
		case 4:
			System.out.println("Rechercher un vol par ses villes de départ et d'arrivée :");
			Scanner sc3 = new Scanner(System.in); 
			System.out.println("Ville de départ :");
			String villeDepart = sc3.next();
			System.out.println("Ville de départ :");
			String villeArrive = sc3.next();
			dao_vol.searchVolByCities(villeDepart, villeArrive);
			sc3.close();
			
			break;

		}
	}

	public static void menuResas() {
		Display.gestionResa();

	}

}
