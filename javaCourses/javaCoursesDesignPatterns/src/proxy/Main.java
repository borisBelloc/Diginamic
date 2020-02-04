package com.stazi.diginamic.designpatterns.proxy;

import java.util.Optional;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Image realImage = new RealImage("david.jpg");
		Image proxyImage = new ImageProxy("jade.jpg");
		
		System.out.println("***** WAIT *****");
		Thread.sleep(3000L);
		
		realImage.display();
		proxyImage.display();

		Optional<String> optionalString = Optional.empty();
		optionalString.orElse("Empty");
	}

}
