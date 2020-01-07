package com.stazi.diginamic.designpatterns.abstractfactory;

public class GitlabParsingFactory extends ParsingFactory {

	@Override
	public DOMParser createParser() {
		return new GitlabDOMParser();
	}

	@Override
	public Crawler createCrawler() {
		return new GitlabCrawler();
	}

}
