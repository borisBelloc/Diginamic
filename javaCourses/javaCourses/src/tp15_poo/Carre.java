package tp15_poo;

public class Carre extends Rectangle {
	private Point firstPoint;
	private int height;
	private int witdh;
	
	public Carre(Point firstPoint, int length) {
		super(firstPoint, length, length);
		this.firstPoint = firstPoint;
		this.height = length;
		this.witdh = length;
	}

}
