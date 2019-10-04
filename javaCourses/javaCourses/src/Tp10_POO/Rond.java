package Tp10_POO;

public class Rond {
	private Point p;
	private int r;

	public Rond(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "ROND [" + p.getX() + ";" + p.getY() + "], " + r;
	}

	public void affiche() {
		System.out.println( toString() );
	}

}
