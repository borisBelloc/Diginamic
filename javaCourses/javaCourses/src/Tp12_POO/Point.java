package Tp12_POO;

public class Point {
	private final int INIT_X = 25;
	private final int INIT_Y = 25;
	private int x;
	private int y;
	
	public Point() {
		super();
		this.x = INIT_X;
		this.y = INIT_Y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ";" + y + "]";
	}

	public void affiche() {
		System.out.println( toString() );
	}
	
	
	
	
}
