package pl.katarzynawojtowicz.FactoryMethodTraining;

public class FactoryMethodTraining {
	public static void main(String args[]) {
		ChocolateFactory factory = new ProducerFactor();
		Chocolate milk = factory.prodChocolate(ChocolateType.MILK);
		Chocolate dark = factory.prodChocolate(ChocolateType.DARK);
		Chocolate withNuts = factory.prodChocolate(ChocolateType.NUTS);
	}
}
