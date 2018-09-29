package pl.wojtowiczkatarzyna.pizzeria.Pizzeria;

public class ExoticPizza implements IPizza {
	private int price;
	private String name;

	public ExoticPizza(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
