package com.stazi.diginamic.designpatterns.proxy;

public class RealImage implements Image {
	
	private String name;
	
	public RealImage(String name) {
		this.name = name;
		loadFromDisk();
	}

	@Override
	public void display() {
		System.out.printf("Displaying image %s\n", name);
	}
	
	private void loadFromDisk() {
		System.out.printf("Image %s loaded from disk\n", name);
	}

}
