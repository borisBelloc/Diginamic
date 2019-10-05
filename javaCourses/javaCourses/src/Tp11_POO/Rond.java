package Tp11_POO;

public class Rond {
	private Point centre;
	private int rayon;

	public Rond(Point centre, int rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "ROND [" + centre.getX() + ";" + centre.getY() + "], " + rayon;
	}

	public void affiche() {
		System.out.println( toString() );
	}

}
