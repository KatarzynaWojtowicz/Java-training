package pl.katarzynawojtowicz.designPatternTraining;

import pl.katarzynawojtowicz.designPatternTraining.Facade.Door;
import pl.katarzynawojtowicz.designPatternTraining.Facade.Light;

public class MainApi {

	private Light homeLight = new HomeLight();
	private Door homeDoor = new HomeDoor();

	public void closeHome() {
		System.out.println("***Close Home***");
		homeLight.off();
		homeDoor.close();
	}

	public void openHome() {
		System.out.println("***Open Home***");
		homeLight.on();
		homeDoor.open();
	}
}
