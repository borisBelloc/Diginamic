package com.stazi.diginamic.designpatterns.abstractfactory;

public class GitlabDOMParser implements DOMParser {

	@Override
	public void parse() {
		System.out.println("Je parse Gitlab");
	}

}
