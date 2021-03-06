package Tp12_POO;

public class Main {

	public static void main(String[] args) {

		Point point = new Point();
		System.out.println(point.toString());
		
		Point randomPoint = FigureUtil.getRandomPoint();
		System.out.print("random Point -> ");
		randomPoint.affiche();
		
		Rond randomRond = FigureUtil.getRandomRond();
		System.out.print("random Point -> ");
		randomRond.affiche();
		
		
		Rectangle randomRectangle = FigureUtil.getRandomRectangle();
		System.out.print("random Rectangle -> ");
		randomRectangle.affiche();
		
//		---------------------------------------------
		
		Point customPoint = new Point();
		customPoint.setX(10);
		customPoint.setY(10);
		System.out.print("--- custom POINT--> ");
		customPoint.affiche();
		
		System.out.print("---Custom Rectangle---> ");
		Rectangle customRectangle = new Rectangle(customPoint, 15, 10);
		customRectangle.affiche();
//		System.out.println(customRectangle.getType());
		
//-----------------------------------------------
		System.out.print("--- Carre ---> ");
		Carre carre = new Carre(customPoint, 10, 10);
		carre.affiche();
		
	}

}
