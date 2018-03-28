package pl.katarzynawojtowicz.FactoryMethodTraining;

public class DarkChocolate extends Chocolate {
	public DarkChocolate() {
		type = ChocolateType.DARK;
	}

	protected void addCocoa() {
		System.out.println("Add cocoa...");
	}

	@Override
	public Chocolate getChocolate() {
		addCocoa();
		return this;
	}

}
