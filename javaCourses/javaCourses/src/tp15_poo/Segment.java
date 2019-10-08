package tp15_poo;

public class Segment extends Figure {
	private Point firstPoint;
	private int lenght;
	private boolean isHorizontal;
	
	public Segment(Point firstPoint, int lenght, boolean isHorizontal) {
		super();
		this.firstPoint = firstPoint;
		this.lenght = lenght;
		this.isHorizontal = isHorizontal;
	}
	public Point getFirstPoint() {
		return this.firstPoint;
	}
	public Point getSecondPoint() {
		Point secondPoint = new Point();
		if (isHorizontal) {
			secondPoint.setX(firstPoint.getX() + lenght);
			secondPoint.setY(firstPoint.getY());
		} else {
			secondPoint.setX(firstPoint.getX());
			secondPoint.setY(firstPoint.getY() + lenght);
		}
		return secondPoint; 
	}
	
//	@Override
	public String toString() {
		return this.getType() + this.getFirstPoint() + this.getSecondPoint() + " || isHorizontal ? " + this.isHorizontal ;
	}

	
	
}



