package com.stazi.diginamic.designpatterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
	ParsingFactory factory = ParsingFactory.get(SCMType.GITLAB);
		
		DOMParser parser = factory.createParser();
		Crawler crawler = factory.createCrawler();
		
		parser.parse();
		crawler.crawl();
	}

}
