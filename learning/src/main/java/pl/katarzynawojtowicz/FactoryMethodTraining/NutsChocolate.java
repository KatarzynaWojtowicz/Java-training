package pl.katarzynawojtowicz.FactoryMethodTraining;

public class NutsChocolate extends Chocolate {
	public NutsChocolate() {
		type = ChocolateType.NUTS;
	}

	protected void addMilk() {
		System.out.println("Add milks...");
	}

	protected void addNuts() {
		System.out.println("Add nuts...");
	}

	public Chocolate getChocolate() {
		addMilk();
		addNuts();
		return this;
	}

}
