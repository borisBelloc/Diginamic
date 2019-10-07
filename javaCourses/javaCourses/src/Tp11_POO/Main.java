package Tp11_POO;

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
		System.out.print("------> ");
		Rectangle customRec = new Rectangle(point, 15, 10);
		customRec.affiche();
		
		Point cuPoint = new Point();
		cuPoint.setX(10);
		cuPoint.setY(10);
		System.out.print("---POINT--> ");
		cuPoint.affiche();
		
	}

}
