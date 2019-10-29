package fr.diginamic.tp51;

public class Main {

	public static void main(String[] args) {
		
		// Maven module used :
		// https://mvnrepository.com/artifact/org.apache.httpcomponents/fluent-hc
		// https://mvnrepository.com/artifact/com.google.code.gson/gson
		// https://mvnrepository.com/artifact/org.mockito/mockito-core
	
		HttpDataService myHttp = new HttpDataService();
		MyIpService getIp = new MyIpService(myHttp);
		
//		System.out.println(myHttp.getJsonIp());
//		System.out.println(getIp.getMyIp());
	}

}
