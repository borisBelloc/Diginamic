package tp20_poo;

public class Carre extends Rectangle implements Surfaceable {
	private Point pointBasGauche;
	private int height;
	private int witdh;
	
	public Carre(Point pointBasGauche, int length) {
		super(pointBasGauche, length, length);
		this.pointBasGauche = pointBasGauche;
		this.height = length;
		this.witdh = length;
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
