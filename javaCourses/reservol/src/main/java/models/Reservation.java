package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	public static Long reservationCounter = 0L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	// Vol vol;
	private Vol numero_vol;
	@Column
	private String nom_user;
	@Column
	private String prenom_user;
	@Column
	private int age_user;

	@Column(unique = true, nullable = false)
	private String numero_resa;

	public Reservation(Vol numero_vol, String nom_user, String prenom_user, int age_user, String numero_resa) {
		super();
		this.numero_vol = numero_vol;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.age_user = age_user;
		this.numero_resa = numero_resa;
		Reservation.reservationCounter++;
	}


	
	
	

}
