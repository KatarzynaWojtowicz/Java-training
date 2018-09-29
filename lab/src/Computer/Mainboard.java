package laboratorium;

public class Mainboard {
	public String producer;
	public String modelName;

	public Mainboard(String producer, String modelName) {
		super();
		this.producer = producer;
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Mainboard [producer=" + producer + ", modelName=" + modelName + "]";
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
}
