package singleton;

public class Singleton {

	/* Null by default */
	private static Singleton singletonInstance;
 
	/**
	 * Private constructor to disallow instanciation from outside
	 */
	private Singleton() {
	}
	

	public static Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

}
