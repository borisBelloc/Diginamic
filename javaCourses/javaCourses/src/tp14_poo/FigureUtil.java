package tp14_poo;

import java.util.concurrent.ThreadLocalRandom;

public class FigureUtil {
	
	private static int getRandomInt() {
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		// sauce: https://stackoverflow.com/a/363692/9552861
		int randomInt = ThreadLocalRandom.current().nextInt(0, 50 + 1);
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




	
}
