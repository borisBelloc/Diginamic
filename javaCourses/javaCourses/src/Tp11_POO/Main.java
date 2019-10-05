package Tp11_POO;

public class Main {

	public static void main(String[] args) {

		Point point = new Point();
		System.out.println(point.toString());
		
		FigureUtil figureUtil = new FigureUtil();
		Point randomPoint = figureUtil.getRandomPoint();
		System.out.print("random Point -> ");
		randomPoint.affiche();
		
		Rond randomRond = figureUtil.getRandomRond();
		System.out.print("random Point -> ");
		randomRond.affiche();
		
		
		Rectangle randomRectangle = figureUtil.getRandomRectangle();
		System.out.print("random Rectangle -> ");
		randomRectangle.affiche();
		
	}

}
