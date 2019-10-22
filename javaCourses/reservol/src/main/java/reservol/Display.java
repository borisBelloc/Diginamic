package reservol;

public class Display {

	public static void Start() {
		System.out.println("1: Gestion des vols");
		System.out.println("2: Gestion des réservations");
		System.out.println("3: Quitter");
	}

	public static void gestionVols() {
		System.out.println("1: Création d’un vol");
		System.out.println("2: Liste des vols");
		System.out.println("3: Rechercher un avion par numéro");
		System.out.println("4: Rechercher un avion par ville de départ et d’arrivée");
	}

	public static void gestionResa() {
		System.out.println("1: Créer une réservation");
		System.out.println("2: Voir les réservations d’un vol");
		System.out.println("3: Annuler une réservation");
		System.out.println("4: Voir toutes les réservations d’une personne");
	}

	public static void quitter() {
		System.out.println("----- quit ----- '");
	}

	// 2 VOLS
	
	public static void enteteVols( ) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Numéro | Type  | Place | Départ    | Arrivé       | Date");
	}
	
}
