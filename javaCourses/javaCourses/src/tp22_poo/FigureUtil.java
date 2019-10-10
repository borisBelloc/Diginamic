package tp22_poo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FigureUtil {

	/**
	 * if getRandomInt() got no argument -> 0, 99 by default
	 */
	private static int getRandomInt() {
		return getRandomInt(0, 99);
	}

	public static int getRandomInt(int vMin, int vMax) {
		int randomInt = ThreadLocalRandom.current().nextInt(vMin, vMax + 1);
		return randomInt;
	}

	public static Point getRandomPoint() {
		Point randomPoint = new Point();
		randomPoint.setX(getRandomInt());
		randomPoint.setY(getRandomInt());
		return randomPoint;
	}

	public static Rond getRandomRond() {
		Rond randomRond = new Rond(getRandomPoint(), getRandomInt());
		return randomRond;
	}

	public static Rectangle getRandomRectangle() {
		Rectangle randomRectangle = new Rectangle(getRandomPoint(), getRandomInt(), getRandomInt());
		return randomRectangle;
	}

	public static Carre getRandomCarre() {
		Carre randomCarre = new Carre(getRandomPoint(), getRandomInt());
		return randomCarre;
	}

	public static Figure getRandomSegment() {
		Random randomBool = new Random();
		Segment randomSegment = new Segment(getRandomPoint(), getRandomInt(), randomBool.nextBoolean());
		return randomSegment;
	}

	public static Figure getRandomSurfacable() {
		switch (FigureUtil.getRandomInt(1, 3)) {
		case 1:
			return FigureUtil.getRandomCarre();
		case 2:
			return FigureUtil.getRandomRectangle();
		case 3:
			return FigureUtil.getRandomRond();
		default:
			return null;
		}
	}

	public static Point[] getPoints(Figure... figures) {
		int nbPointsTotal = 0;
		Point[] listPoint;
		Point[] pointTemp;

		// Count Point number to create array
		for (Figure figure : figures) {
			nbPointsTotal += figure.getPoints().length;
		}

		listPoint = new Point[nbPointsTotal];
//		System.out.println("Nombre de points---> " + listPoint.length);

//		--------------------
		// pointCounter -> Compte le nombre de point placé afin de remplir le nouveau tableau
		int pointCounter = 0;
		for (int i = 0; i < figures.length; i++) {

			pointTemp = figures[i].getPoints();

			for (int j = 0; j < pointTemp.length; j++) {
				listPoint[pointCounter++] = pointTemp[j];
			}
		}

		System.out.println("** affichage du tableau de point***");
		for (int k = 0; k < listPoint.length; k++) {
			System.out.println("Slot " + k + " : " + listPoint[k]);
		}
		return listPoint;
	}
	
	public static ArrayList<Figure> genere(int nombreFigure) {
		ArrayList<Figure> randomFigures = new ArrayList<Figure>();
		for (int i = 0; i < nombreFigure; i++) {
			randomFigures.add(getRandomSurfacable());
		}
		return randomFigures;
	}

}
