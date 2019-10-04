package Tp10_POO;

public class Main {

	public static void main(String[] args) {

		Point point = new Point(5, 4);
		System.out.println(point.toString());
		
		Rond rond = new Rond(point, 6);
		rond.affiche();
		
		

	}

}
