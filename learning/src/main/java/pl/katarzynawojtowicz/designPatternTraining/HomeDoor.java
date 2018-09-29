package pl.katarzynawojtowicz.designPatternTraining;

import pl.katarzynawojtowicz.designPatternTraining.Facade.Door;

public class HomeDoor implements Door {

	@Override
	public void open() {
		System.out.println("Door in home is open!");
	}

	@Override
	public void close() {
		System.out.println("Door in home is close!");
	}

}
