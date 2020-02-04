package decorator.formating;

import decorator.Text;
import decorator.TextDecorator;

public class Bold extends TextDecorator {

	public Bold(Text text) {
		super(text);
	}
	
	public String displayText() {
		return "aa " + super.displayText() + " bb ";
	}
	
	

}
