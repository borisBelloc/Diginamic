package com.stazi.diginamic.designpatterns.abstractfactory;

public class GithubCrawler implements Crawler {

	@Override
	public void crawl() {
		System.out.println("Crawl Github");
	}

}
