package tp20_poo;

public class test {
	package fr.diginamic.stazi.figures.figure;

	public class Test extends Figure implements Surfaceable {
		protected Point pointBasGauche;
		protected Point pointHautGauche;
		protected Point pointBasDroite;
		protected Point pointHautDroite;
		
		protected int longueurX;
		protected int longueurY;
		
		public Rectangle(Point pointBasGauche, int longueurX, int longueurY) {
			this.pointBasGauche = pointBasGauche;
			this.pointHautGauche = new Point(pointBasGauche.getX(), pointBasGauche.getY() + longueurY);
			this.pointBasDroite = new Point(pointBasGauche.getX() + longueurX, pointBasGauche.getY());
			this.pointHautDroite = new Point(pointBasGauche.getX() + longueurX, pointBasGauche.getY() + longueurY);
		
			this.longueurX = longueurX;
			this.longueurY = longueurY;
		}
		
		public void move(int x, int y) {
			pointBasGauche.setX(pointBasGauche.getX() + x);
			pointBasGauche.setY(pointBasGauche.getY() + y);
			
			pointHautGauche.setX(pointHautGauche.getX() + x);
			pointHautGauche.setY(pointHautGauche.getY() + y);

			pointBasDroite.setX(pointBasDroite.getX() + x);
			pointBasDroite.setY(pointBasDroite.getY() + y);

			pointHautDroite.setX(pointHautDroite.getX() + x);
			pointHautDroite.setY(pointHautDroite.getY() + y);
			
		}

		public Point getPointBasGauche() {
			return pointBasGauche;
		}

		public Point getPointHautGauche() {
			return pointHautGauche;
		}

		public Point getPointBasDroite() {
			return pointBasDroite;
		}

		public Point getPointHautDroite() {
			return pointHautDroite;
		}
		
		public String getType() {
			return "RECT";
		}
		
		public String toString() {
			return "[" + getType() + " " + pointBasGauche + pointHautGauche + pointHautDroite + pointBasDroite + "]";
		}
		
		public Rectangle clone() throws CloneNotSupportedException {
			return (Rectangle) super.clone();
		}

		@Override
		public double surface() {
			return longueurX * longueurY;
		}
	}

}
