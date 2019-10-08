package tp15_poo;

public abstract class Figure {
//	private Point firstPoint;
//	private int height;
//	private int witdh;

	public abstract String toString();
	
	
	public void affiche() {
		System.out.println( toString() );
	}
	
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
	public static Figure getRandomFigure() {
		switch (FigureUtil.getRandomInt(1, 4)) {
		case 1:
			return FigureUtil.getRandomCarre();
		case 2: 
			return FigureUtil.getRandomRectangle();
		case 3: 
			return FigureUtil.getRandomRond();
		case 4: 
			return FigureUtil.getRandomSegment();
		default:
			return null;
		}
	}
	
	
}
