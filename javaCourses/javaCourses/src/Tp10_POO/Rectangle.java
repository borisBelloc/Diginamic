package Tp10_POO;

public class Rectangle {
	private Point firstPoint;
	private int height;
	private int witdh;

	public Rectangle(Point firstPoint, int height, int witdh) {
		super();
		this.firstPoint = firstPoint;
		this.height = height;
		this.witdh = witdh;
	}

	
	public Point getPointBasGauche() {
		return this.firstPoint;
	}
	
	public Point getPointBasDroit() {
		return new Point (this.firstPoint.getX() + witdh, this.firstPoint.getY() ); 
	}
	public Point getPointHautGauche() {
		return new Point (this.firstPoint.getX(), this.firstPoint.getY() + height ); 
	}

	public Point getPointHautDroit() {
		return new Point (this.firstPoint.getX() + witdh, this.firstPoint.getY() + height ); 
	}


	@Override
	public String toString() {
		return "[RECT " + firstPoint + getPointBasDroit() + getPointHautGauche() + getPointHautDroit() + "]";
	}
	
	public void affiche() {
		System.out.println( toString() );
	}
}
	