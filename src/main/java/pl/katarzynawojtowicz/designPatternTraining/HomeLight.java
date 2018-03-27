package pl.katarzynawojtowicz.designPatternTraining;

import pl.katarzynawojtowicz.designPatternTraining.Facade.Light;

public class HomeLight implements Light {

	@Override
	public void on() {
		System.out.println("Light in home is on!");
	}

	@Override
	public void off() {
		System.out.println("Light in home is off!");
	}

}
