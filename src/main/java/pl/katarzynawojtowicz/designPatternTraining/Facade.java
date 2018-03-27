package pl.katarzynawojtowicz.designPatternTraining;

public class Facade {
	public interface Light {
		void on();

		void off();
	}

	public interface Door {
		void open();

		void close();
	}

}
