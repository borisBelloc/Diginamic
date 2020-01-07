package com.stazi.diginamic.designpatterns.abstractfactory;

public class GithubParsingFactory extends ParsingFactory {

	@Override
	public DOMParser createParser() {
		return new GithubDOMParser();
	}

	@Override
	public Crawler createCrawler() {
		return new GithubCrawler();
	}

}
