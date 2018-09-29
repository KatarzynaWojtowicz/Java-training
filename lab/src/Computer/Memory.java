package laboratorium;

public class Memory {
	public String producer;
	public double size;

	public Memory(String producer, double size) {
		super();
		this.producer = producer;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Memory [producer=" + producer + ", size=" + size + "]";
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
