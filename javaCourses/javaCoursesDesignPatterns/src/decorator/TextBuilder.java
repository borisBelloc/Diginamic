package decorator;

import decorator.formating.Bold;

public class TextBuilder {
	private Text text;
	
	public TextBuilder() {
		this.text = new TextImplemented();
	}
	
	
	public TextBuilder Bold() {
		this.text = new Bold(text);
		return this;
	}
	

}
