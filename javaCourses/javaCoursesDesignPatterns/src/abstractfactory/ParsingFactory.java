package com.stazi.diginamic.designpatterns.abstractfactory;

public abstract class ParsingFactory {
	
	public static ParsingFactory get(SCMType type) {
		switch (type) {
		case GITHUB:
			return new GithubParsingFactory();
		case GITLAB:
			return new GitlabParsingFactory();
		default:
			return null;
		}
	}
	
	public abstract DOMParser createParser();
	public abstract Crawler createCrawler();
}
