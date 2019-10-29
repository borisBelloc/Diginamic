package javaCoursesLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	

	public static void main(String[] args) {
		
		// tuto log : https://www.baeldung.com/logback
		
		logger.debug("hello");
		
		logger.info("Example log from {}", Main.class.getSimpleName());
		
		

		 

	}

}
