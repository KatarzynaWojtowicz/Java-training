package laboratorium;

public class HardDrive {
	public String producer;
	public double capacity;

	public HardDrive(String producer, double capacity) {
		super();
		this.producer = producer;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDrive [producer=" + producer + ", capacity=" + capacity + "]";
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
