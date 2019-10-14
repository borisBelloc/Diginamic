package tp_LOTR;

public class Character {
	
	private String name;
	private Gender gender;
	private Race race;
	private int height;
	private boolean good;
	
	public Character(String name, Gender gender, Race race, int height, boolean good) {
		super();
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.height = height;
		this.good = good;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
	
	
}
