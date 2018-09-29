package pl.zaliczenie.singleton;

public class Demo {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.dzialaj();
	}
}
