package tp15_poo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FigureUtil {
	

	/** 
	 * if getRandomInt() got no argument -> 0, 50 by default
	 * */
	private static int getRandomInt() {
		return getRandomInt(0, 50);
	}
		
	public static int getRandomInt(int vMin, int vMax) {
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		// sauce: https://stackoverflow.com/a/363692/9552861
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



	
}
