package models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true, nullable = false)
	private long numero_vol; // TODO: Unique 4 characteres
	@Column(nullable = false)
	private Avion avion;
	@Column(nullable = false)
	private int nombre_place;
	@Column(nullable = false)
	private String ville_depart;
	@Column(nullable = false)
	private String ville_arrive;
	@Column(nullable = false)
	private LocalDate date_depart;
	
	@OneToMany(mappedBy = "numero_vol")
    private List<Reservation> reservations;
 




	
	
	
	
	

}
