package com.stazi.diginamic.designpatterns.proxy;

public class ImageProxy implements Image {
	
	private String name;
	private Image proxiedImage;
	
	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		if (proxiedImage == null) {
			proxiedImage = new RealImage(name);
		}
		proxiedImage.display();
	}

}
