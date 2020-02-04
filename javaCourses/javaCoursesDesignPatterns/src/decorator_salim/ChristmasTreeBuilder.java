package decorator_salim;

public class ChristmasTreeBuilder {
	private ChristmasTree tree;
	
	public ChristmasTreeBuilder() {
		this.tree = new ChristmasTreeImpl();
	}
	
	public ChristmasTreeBuilder addBubbleLights() {
		this.tree = new BubbleLights(tree);
		return this;
	}
	
	public ChristmasTreeBuilder addStar() {
		this.tree = new Star(tree);
		return this;
	}
	
	public ChristmasTree build() {
		return this.tree;
	}
}
