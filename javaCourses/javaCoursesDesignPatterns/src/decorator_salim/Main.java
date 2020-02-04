package decorator_salim;

public class Main {

	public static void main(String[] args) {
		ChristmasTree tree = new ChristmasTreeImpl();
		
		System.out.println(tree.decorate());
		
		ChristmasTreeBuilder builder = new ChristmasTreeBuilder();
		ChristmasTree decoratedTree = builder.addStar().addBubbleLights().addStar().build();
		
		System.out.println(decoratedTree.decorate());
	}

}
