package Tp10_POO;

public class Rectangle {
	private Point p;
	private int a;
	private int b;
	
	public Rectangle(Point p, int a, int b) {
		super();
		this.p = p;
		this.a = a;
		this.b = b;
	}

	public Point getPointBasDroit() {
		// TODO finir
		return new Point (this.p.getX() + 20 + getY())
		//return Point;
	}


	
	
	
	
}
