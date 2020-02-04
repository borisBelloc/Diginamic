package fr.diginamic.tpSpringSecurity.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role_")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String label;
	
//	JPA requiert un constructeur vide
	public Role() {
	}

	public Role(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	// un role contient des droits
	// @JoinTable facultatif, permet de customiser la table (overide le par default)
	@ManyToMany
	@JoinTable(name = "role_has_right",
				joinColumns = @JoinColumn(name = "role_id"),
				inverseJoinColumns = @JoinColumn(name = "right_id"))
	private Set<Right> rights;
	
	
	
	
}
