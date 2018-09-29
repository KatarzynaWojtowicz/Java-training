package pl.zaliczenie.singleton;

public class Singleton {
	private static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	private Singleton() {
	}

	public void dzialaj() {
		System.out.println("Program dziala");
	}

}
