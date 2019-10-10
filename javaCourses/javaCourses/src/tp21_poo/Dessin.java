package tp21_poo;

import java.util.ArrayList;

public class Dessin {
	private ArrayList<Figure> listeFigures = new ArrayList<Figure>();

	public Dessin() {
		super();
	}

	boolean add(Figure figure) {
		return this.listeFigures.add(figure);
	}

	public ArrayList<Figure> getListeFigures() {
		return listeFigures;
	}

}
