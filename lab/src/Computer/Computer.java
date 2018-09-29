package laboratorium;

public class Computer {
	private String name;
	private String producer;
	private Processor processor;
	private Mainboard mainboard;
	private Memory memory;
	private HardDrive hardDrive;

	public Computer(String name, String producer, Processor processor, Mainboard mainboard, Memory memory,
			HardDrive hardDrive) {
		super();
		this.name = name;
		this.producer = producer;
		this.processor = processor;
		this.mainboard = mainboard;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}

	@Override
	public String toString() {
		return "Computer [name= " + name + ",producer= " + producer + ", \nprocessor=" + processor + ", \nmainboard="
				+ mainboard + ", \nmemory=" + memory + ", \nhardDrive=" + hardDrive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
}
