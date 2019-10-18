package fr.dta.bookstore;

public enum Gender {
	MALE("Male"),
	FEMALE("Female"),
	FLUID("Fluid");
	
	private String name;
	
	Gender (String name) {
		this.name = name;
	}
	
    public String toString() {
	       return this.name;
	    }
}

