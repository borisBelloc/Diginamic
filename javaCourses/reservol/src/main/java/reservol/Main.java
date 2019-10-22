package reservol;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import dao.dao;
import dao.dao_reservation;
import dao.dao_vol;
import database.DatabaseHelper;
import models.Avion;
import models.Vol;


public class Main {

	public static void main(String[] args) {
		Display.Start();
		
		
		
		System.out.println("Allo");
//		int aa =  Utils.userInputInt();
//		System.out.println(aa);
		
		Vol vol1 = dao_vol.createVol("50545", Avion.A330, 50, "Paris", "Montpellier", LocalDate.now());
		Vol vol2 = dao_vol.createVol("00001", Avion.A330, 50, "Paris", "Montpellier",  LocalDate.of(2020,4,24 ));
		dao.saveNewObjectToDb(vol1, vol2);
				
		dao_vol.readVol();
		
		
//		Reservation resa1 = dao_reservation.createReservation(vol1, Belloc, Boris, 25, getIdReservation)_
		
	}
	
	

}
