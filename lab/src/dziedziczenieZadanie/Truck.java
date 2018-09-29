package dziedziczenieZadanie;

public class Truck implements Vehicle {
	private String vin;
	private String name;
	private int platesNumber;
	private Color color;
	private int numberOfSeats;

	public Truck(String vin) {
		this.vin = vin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlatesNumber() {
		return platesNumber;
	}

	public void setPlatesNumber(int platesNumber) {
		this.platesNumber = platesNumber;
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

	public Truck(String name, int platesNumber, Color color, int numberOfSeats) {
		super();
		this.name = name;
		this.platesNumber = platesNumber;
		this.color = color;
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Truck [name=" + name + ", platesNumber=" + platesNumber + ", color=" + color + ", numberOfSeats="
				+ numberOfSeats + "]";
	}

	@Override
	public void startEngine() {
		System.out.println("Uruchamiam silnik ciezarowki\n");
	}

	@Override
	public int compareTo(Object other) {
		if (other instanceof Car) {
			return vin.compareTo(((Car) other).getVin());
		} else
			return -1;
	}

	@Override
	public String vin() {
		return vin;
	}

}
