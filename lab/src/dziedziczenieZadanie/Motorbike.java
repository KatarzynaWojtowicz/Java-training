package dziedziczenieZadanie;

public class Motorbike implements Vehicle {
	private String vin;
	private String name;
	private int platesNumber;
	private int engineSize;

	public Motorbike(String vin) {
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

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public Motorbike(String name, int platesNumber, int engineSize) {
		super();
		this.name = name;
		this.platesNumber = platesNumber;
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Motorbike [name=" + name + ", platesNumber=" + platesNumber + ", engineSize=" + engineSize + "]";
	}

	@Override
	public void startEngine() {
		System.out.println("Uruchamiam silnik motocyklu\n");

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
