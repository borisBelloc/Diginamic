package com.stazi.diginamic.designpatterns.abstractfactory;

public class GithubDOMParser implements DOMParser {

	@Override
	public void parse() {
		System.out.println("Je parse Github");
	}

}
