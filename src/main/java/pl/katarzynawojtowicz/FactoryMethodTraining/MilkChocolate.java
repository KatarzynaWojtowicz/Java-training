package pl.katarzynawojtowicz.FactoryMethodTraining;

public class MilkChocolate extends Chocolate {
	public MilkChocolate() {
		type = ChocolateType.MILK;
	}

	protected void addMilk() {
		System.out.println("Add milks...");
	}

	@Override
	public Chocolate getChocolate() {
		addMilk();
		return this;
	}

}
