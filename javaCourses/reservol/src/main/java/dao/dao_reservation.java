package dao;

import models.Reservation;
import models.Vol;

public class dao_reservation {
	
	//TODO TODO TODO TODO 
	public static Reservation createReservation( Vol numero_vol, String nom_user, String prenom_user, int age_user ) {
		String numero_resa = Long.parseLong(numero_vol.getNumero_vol()) + "-" + Reservation.reservationCounter;
		Reservation reservation = new Reservation(numero_vol, nom_user, prenom_user, age_user, numero_resa);
		return reservation;
	}
	
	

}
