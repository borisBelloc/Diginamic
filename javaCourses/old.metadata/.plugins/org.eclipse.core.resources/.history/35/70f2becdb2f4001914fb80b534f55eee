package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Vol numero_vol;
	@Column
	private String nom_user;
	@Column
	private String prenom_user;
	@Column
	private int age_user;

	@Column(unique = true, nullable = false)
	private Long numero_resa;


	
	
	

}
