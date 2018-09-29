package pl.katarzynawojtowicz.FactoryMethodTraining;

public class ProducerFactor implements ChocolateFactory {

	@Override
	public Chocolate prodChocolate(ChocolateType type) {
		Chocolate chocolate = null;

		switch (type) {
		case MILK: {
			chocolate = new MilkChocolate();
			break;
		}
		case DARK: {
			chocolate = new DarkChocolate();
			break;
		}
		case NUTS: {
			chocolate = new NutsChocolate();
			break;
		}
		}
		return chocolate;
	}
}
