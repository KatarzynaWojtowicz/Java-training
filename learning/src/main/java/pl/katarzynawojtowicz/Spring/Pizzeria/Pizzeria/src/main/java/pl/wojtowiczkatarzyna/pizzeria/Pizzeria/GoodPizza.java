package pl.wojtowiczkatarzyna.pizzeria.Pizzeria;

public class GoodPizza implements IPizza {
	private int price;
	private String name;

	public GoodPizza(int price, String name) {
		super();
		this.name = name;
		this.price = price;
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
