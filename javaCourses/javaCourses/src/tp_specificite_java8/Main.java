package tp_specificite_java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {

	public static void main(String[] args) {


        LocalDate oldDate = LocalDate.of(1985, 04, 25);
        LocalDate newDate = LocalDate.now();
        System.out.println("today is : " + newDate);
        
        Period period = Period.between(oldDate, newDate);
//        System.out.println("Period -> " + period);
        
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months and ");
        System.out.print(period.getDays() + " days");
        
        
//        Exemple correction :
        
//    	LocalDateTime time1 = LocalDateTime.of(1988, 11, 27, 22, 00);
//		System.out.println(time1);
//		
//		LocalDateTime time2 = LocalDateTime.now();
//		System.out.println(time2);
//		
//		Duration d = Duration.between(time1, time2);
//		System.out.println(d);
//​
//		System.out.println(d.toDays());
//		Period p = Period.between(time1.toLocalDate(), time2.toLocalDate());
//		System.out.println(p);
//		
//		
//		long hours = d.getSeconds() / 3600 % 24;
//		long minutes = d.getSeconds() / 60 % 24 % 60;
//		long seconds = d.getSeconds() % 24 % 60 % 60;
//		String ageDisplay = "%s ans, %s mois, %s jours, %s heures, %s minutes, %s secondes.";
//		ageDisplay = String.format(ageDisplay, p.getYears(), p.getMonths(), p.getDays(), hours, minutes, seconds);
//		System.out.println(ageDisplay);
//		
//		LocalDateTime next = time1.withYear(2019);
//		Period untilBd = Period.between(time2.toLocalDate(), next.toLocalDate());
//		System.out.println(untilBd);

	}

}
