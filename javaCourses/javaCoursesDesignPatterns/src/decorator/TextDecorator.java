package decorator;

public class TextDecorator implements Text {
	private Text text;
	
	public TextDecorator(Text text) {
		this.text = text;
	}
	

	@Override
	public String displayText() {
		return text.displayText();
	}

}
