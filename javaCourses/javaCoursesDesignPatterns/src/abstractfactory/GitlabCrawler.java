package com.stazi.diginamic.designpatterns.abstractfactory;

public class GitlabCrawler implements Crawler {

	@Override
	public void crawl() {
		System.out.println("Crawl Gitlab");		
	}

}
