package models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true, nullable = false)
	private String numero_vol;
	@Enumerated(EnumType.STRING)
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
	
	//vol
	@OneToMany(mappedBy = "numero_vol")
    private List<Reservation> reservations;
 
	//constructor
	public Vol(String numero_vol, Avion avion, int nombre_place, String ville_depart, String ville_arrive,
			LocalDate date_depart) {
		super();
		this.numero_vol = numero_vol;
		this.avion = avion;
		this.nombre_place = nombre_place;
		this.ville_depart = ville_depart;
		this.ville_arrive = ville_arrive;
		this.date_depart = date_depart;
	}

	public Vol() {
		super();
	}

	@Override
	public String toString() {
		return "Vol [numero_vol=" + numero_vol + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero_vol() {
		return numero_vol;
	}

	public void setNumero_vol(String numero_vol) {
		this.numero_vol = numero_vol;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public int getNombre_place() {
		return nombre_place;
	}

	public void setNombre_place(int nombre_place) {
		this.nombre_place = nombre_place;
	}

	public String getVille_depart() {
		return ville_depart;
	}

	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}

	public String getVille_arrive() {
		return ville_arrive;
	}

	public void setVille_arrive(String ville_arrive) {
		this.ville_arrive = ville_arrive;
	}

	public LocalDate getDate_depart() {
		return date_depart;
	}

	public void setDate_depart(LocalDate date_depart) {
		this.date_depart = date_depart;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}




	
	
	
	
	

}
