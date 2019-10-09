package tp20_poo;

public class Rectangle extends Figure implements Surfaceable {
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
		Point pointBasDroit = new Point();
		pointBasDroit.setX(firstPoint.getX() + witdh);
		pointBasDroit.setY(firstPoint.getY());
		return pointBasDroit; 
	}
	public Point getPointHautGauche() {
		Point pointHautGauche = new Point();
		pointHautGauche.setX(firstPoint.getX());
		pointHautGauche.setY(firstPoint.getY() + height);
		return pointHautGauche; 
	}
	public Point getPointHautDroit() {
		Point pointHautDroit = new Point();
		pointHautDroit.setX(firstPoint.getX() + witdh);
		pointHautDroit.setY(firstPoint.getY() + height);
		return pointHautDroit; 
	}


	@Override
	public String toString() {
		return this.getType() + " " + firstPoint + getPointBasDroit() + getPointHautGauche() + getPointHautDroit() + "]";
	}

	@Override
	public double surface() {
		return (this.height * this.witdh);
	}

	
}
	