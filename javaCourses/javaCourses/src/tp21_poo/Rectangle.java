package tp21_poo;

public class Rectangle extends Figure implements Surfaceable {
	private Point pointBasGauche; // Point Bas Gauche
	private int height;
	private int witdh;
	
	private Point pointBasDroit;
	private Point pointHautGauche;
	private Point pointHautDroit;
	

	/** 
	 * pointBasGauche is firstPoint
	 * */
	public Rectangle(Point pointBasGauche, int height, int witdh) {
		super();
		this.pointBasGauche = pointBasGauche;
		this.height = height;
		this.witdh = witdh;
		
		this.pointBasDroit = new Point();
		pointBasDroit.setX(pointBasGauche.getX() + witdh);
		pointBasDroit.setY(pointBasGauche.getY());
		
		this.pointHautGauche = new Point();
		pointHautGauche.setX(pointBasGauche.getX());
		pointHautGauche.setY(pointBasGauche.getY() + height);
		
		this.pointHautDroit = new Point();
		pointHautDroit.setX(pointBasGauche.getX() + witdh);
		pointHautDroit.setY(pointBasGauche.getY() + height);
	}
	
	public Point getPointBasGauche() {
		return this.pointBasGauche;
	}
	public Point getPointBasDroit() {
		return this.pointBasDroit; 
	}
	public Point getPointHautGauche() {
		return this.pointHautGauche; 
	}
	public Point getPointHautDroit() {
		return this.pointHautDroit; 
	}

	@Override
	public String toString() {
		return this.getType() + " " + getPointBasGauche() + getPointBasDroit() + getPointHautGauche() + getPointHautDroit() + "]";
	}

	@Override
	public double surface() {
		return (this.height * this.witdh);
	}

	@Override
	public Point[] getPoints() {
		Point[] pointList = { this.getPointBasGauche(), this.getPointBasDroit(), this.getPointHautGauche(), this.getPointHautDroit() };
		return pointList;
	}

	
}
	