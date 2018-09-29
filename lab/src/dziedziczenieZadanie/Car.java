package dziedziczenieZadanie;

public class Car implements Vehicle {
	private String vin;
	private String name;
	private Color color;
	private int numberOfSeats;
	private int platesNumber;

	public Car(String vin) {
		this.vin = vin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getPlatesNumber() {
		return platesNumber;
	}

	public void setPlatesNumber(int platesNumber) {
		this.platesNumber = platesNumber;
	}

	public Car(String name, Color color, int numberOfSeats, int platesNumber) {
		super();
		this.name = name;
		this.color = color;
		this.numberOfSeats = numberOfSeats;
		this.platesNumber = platesNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", numberOfSeats=" + numberOfSeats + ", platesNumber="
				+ platesNumber + "]";
	}

	@Override
	public void startEngine() {
		System.out.println("Uruchamiam silnik samochodu\n");

	}

	@Override
	public int compareTo(Object other) {
		if (other instanceof Car) {
			return vin.compareTo(((Car) other).getVin());
		} else
			return -1;
	}

	public String getVin() {
		return vin;
	}

	@Override
	public String vin() {
		return vin;

	}

}