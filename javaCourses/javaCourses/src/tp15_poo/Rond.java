package tp15_poo;

public class Rond extends Figure {
	private Point centre;
	private int rayon;

	public Rond(Point centre, int rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Rond [" + centre.getX() + ";" + centre.getY() + "], " + rayon;
	}
}
