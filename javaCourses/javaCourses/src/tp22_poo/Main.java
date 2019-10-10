package tp22_poo;

public class Main {

	public static void main(String[] args) {

		Point point = new Point();
		System.out.println(point.toString());

		Point randomPoint = FigureUtil.getRandomPoint();
		System.out.print("random Point -> ");
		randomPoint.affiche();

		Rond randomRond = FigureUtil.getRandomRond();
		System.out.print("random Rond -> ");
		randomRond.affiche();

		Rectangle randomRectangle = FigureUtil.getRandomRectangle();
		System.out.print("random Rectangle -> ");
		randomRectangle.affiche();

		Carre randomCarre = FigureUtil.getRandomCarre();
		System.out.print("random Carre -> ");
		randomCarre.affiche();

		System.out.println("-------------------");

		Point customPoint = new Point();
		customPoint.setX(10);
		customPoint.setY(10);
		System.out.print("Custom POINT--> ");
		customPoint.affiche();

		System.out.print("Custom Rectangle--> ");
		Rectangle customRectangle = new Rectangle(customPoint, 15, 10);
		customRectangle.affiche();

		System.out.print("Custom Carre--> ");
		Carre carre = new Carre(customPoint, 20);
		carre.affiche();

		System.out.println("-------------------");

		// TEST .equal()
		Point a = new Point();
		a.setX(10);
		a.setY(10);
		Point b = new Point();
		b.setX(10);
		b.setY(10);
		System.out.println(a.equals(b));
		Point c = new Point();
		c.setX(10);
		c.setY(15);
		System.out.println(a.equals(c));

		// RANDOM FIGURE
		System.out.print("Random carre : ");
		System.out.println(FigureUtil.getRandomCarre());
		System.out.print("Random rond : ");
		System.out.println(FigureUtil.getRandomRond());
		System.out.print("Random Rectangle : ");
		System.out.println(FigureUtil.getRandomRectangle());
		System.out.print("Random figure ------> ");
		System.out.println(Figure.getRandomFigure());

		// Segment
		Segment segment = new Segment(point, 10, true);
		segment.affiche();
		// RANDOM SEGMENT
		System.out.print("Random segment : ");
		System.out.println(FigureUtil.getRandomSegment());

		// SURFACE
		System.out.println("Surface rond : " + randomRond.surface());
		System.out.println("Surface carre : " + randomCarre.surface());
		System.out.println("Surface rectangle : " + randomRectangle.surface());

		System.out.println("-------------------");

		// Random surfaceable
		Figure randomFigure = FigureUtil.getRandomSurfacable();
		randomFigure.affiche();
		System.out.println("-------------------");
		
		
		// Count Point
		int tailleRec = randomRectangle.getPoints().length;
		System.out.print(tailleRec);
		int tailleCar = randomCarre.getPoints().length;
		System.out.print(tailleCar);
		int tailleRon = randomRond.getPoints().length;
		System.out.print(tailleRon);
		int tailleSeg = segment.getPoints().length;
		System.out.println(tailleSeg);
		System.out.println("-------------------");
		
//		FigureUtil.getPoints()
		Figure[] fig = {Figure.getRandomFigure(), Figure.getRandomFigure()};
//		fig[0].affiche();
//		fig[1].affiche();
//		System.out.println(fig[0].getType());
		
		FigureUtil.getPoints(fig);
		System.out.println("-------------------");

		// genere random figure inside picture
		System.out.println(FigureUtil.genere(5));
		
		System.out.println(randomRectangle.couvre(point));
		
	}

}
