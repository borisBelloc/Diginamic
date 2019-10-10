package tp22_poo;

public class Rond extends Figure implements Surfaceable {
	private Point centre;
	private int rayon;

	public Rond(Point centre, int rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}
	public int getRayon() {
		return rayon;
	}



	@Override
	public String toString() {
		return "Rond [" + centre.getX() + ";" + centre.getY() + "], " + rayon;
	}

	@Override
	public double surface() {
		return (this.rayon * this.rayon) * Math.PI;
	}
	
	@Override
	public Point[] getPoints() {
		Point[] pointList = { this.getCentre() };
		return pointList;
	}
}
