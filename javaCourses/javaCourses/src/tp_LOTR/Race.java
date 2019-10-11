package tp_LOTR;

public enum Race {
	ELF(true, 200, 10),
	HUMAN(true, 170, 70),
	HOBBIT(true, 107, 40),
	DWARF(true, 137, 80),
	ENT(true, 400, 2000),
	ORC(false, 140, 80),
	URUK(false, 190, 120),
	MAIAR(false, 250, 200);
	
	private boolean good;
	private int averageHeight;
	private int averageWeight;
	
	private Race(boolean good, int averageHeight, int averageWeight) {
		this.good = good;
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
	}
	
	public boolean isGood() {
		return good;
	}

	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public int getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(int averageWeight) {
		this.averageWeight = averageWeight;
	}

	public void setGood(boolean good) {
		this.good = good;
	}
	
	

}
