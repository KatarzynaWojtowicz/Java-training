package laboratorium;

public class Processor {
	public String producer;
	public String modelName;
	public double speed;
	public double memory;

	public Processor(String producer, String modelName, double speed, double memory) {
		super();
		this.producer = producer;
		this.modelName = modelName;
		this.speed = speed;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Processor [producer=" + producer + ", modelName=" + modelName + ", speed=" + speed + ", memory="
				+ memory + "]";
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

}
