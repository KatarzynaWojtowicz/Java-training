package pl.katarzynawojtowicz.designPatternTraining;

public class DesignPatternsFacade {
	public static void main(String[] args) {

		MainApi mainApi = new MainApi();
		mainApi.closeHome();
		System.out.println("************");
		mainApi.openHome();
	}
}
