package appliweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {

	private List<Etudiant> etudiants = new ArrayList<Etudiant>();

	@GetMapping("/classe")
	public List<Etudiant> getClasse() {
		return etudiants;
	}

	@GetMapping("/welcome/{nom}/{prenom}/{age}")
	public Etudiant getEtudiant(@PathVariable(name = "nom") String nom, @PathVariable(name = "prenom") String prenom,
			@PathVariable(name = "age") int age) {
		Etudiant e = new Etudiant(nom, prenom, age);
		etudiants.add(e);
		return e;
	}

	@GetMapping("/killAll")
	public void killAll() {
		this.etudiants = new ArrayList<Etudiant>();
	}
}
