package tp_LOTR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		 List<Party> parties = initialize();
		 
		 // TODO: Recuperer les groupes contenant au moins une femme
		 
		 List<Party> partiesWithFemale = parties.stream()
		 	// y a t'il une femme dans party -> ?
		 	.filter( party -> party.getMembers().stream()
		 			.filter(character -> character.getGender().equals(Gender.FEMALE))
		 			.count() > 0)
		 	// on la récupere
		 	.collect(Collectors.toList());
		 
		 partiesWithFemale.forEach(System.out::println);
		 
		 // TODO: récuperer une liste des personnages dont la gentillesse n'est pas en 
		 // accord avec leur race
		 
		 // TODO: Récupérer les groupes dont la taille totale ne dépasse pas 600cm
		 
		 // TODO: récupérer dans une liste de tous les personnage dont la taille est supérieur
		 // a la taille moyenne de leur race.

		 
		
	}
		
		private static List<Party> initialize() {
			List<Party> parties = new ArrayList<>();
			
			Character gandalf = new Character("Gandalf", Gender.MALE, Race.MAIAR, 230, true);
			Character frodo = new Character("Frodo", Gender.MALE, Race.HOBBIT, 110, true);
			Character sam = new Character("Sam", Gender.MALE, Race.HOBBIT, 110, true);
			Character gimli = new Character("Gimli", Gender.MALE, Race.DWARF, 80, true);
			
			List<Character> fellowshipMembers = Arrays.asList(gandalf, frodo, sam, gimli); 
			Party fellowship = new Party("The Fellowship of the ring", gandalf, fellowshipMembers);
			parties.add(fellowship);
			
			Character sauron = new Character("Sauron", Gender.MALE, Race.MAIAR, 240, false);
			Character orc1 = new Character("orc1", Gender.FEMALE, Race.ORC, 160, false);
			Character orc2 = new Character("orc2", Gender.MALE, Race.ORC, 170, false);
			Character uruk1 = new Character("uruk1", Gender.FEMALE, Race.URUK, 230, false);
			
			List<Character> theBadGuysMembers = Arrays.asList(sauron, orc1, orc2, uruk1);
			Party theBadGuys = new Party("Sauron's army", sauron, theBadGuysMembers);
			parties.add(theBadGuys);
			
			return parties;
			
		}

	}

