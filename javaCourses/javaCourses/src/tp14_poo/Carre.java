package tp14_poo;

public class Carre extends Rectangle {
	private Point firstPoint;
	private int height;
	private int witdh;
	
	public Carre(Point firstPoint, int height, int witdh) {
		super(firstPoint, height, height);
		this.firstPoint = firstPoint;
		this.height = height;
		this.witdh = witdh;
	}

	public Point getPointBasGauche() {
		return this.firstPoint;
	}
	


	public void affiche() {
		super.affiche();
		
	}
	
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
}
