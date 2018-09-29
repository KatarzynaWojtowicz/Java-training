package kolekcje;

public class MojStos {
	public static void main(String[] args) {
		Stos<String> mojstos = new Stos<String>();

		mojstos.add("Kot");
		mojstos.add("Pies");
		mojstos.add("Rybka");

		System.out.println("Pierwszy element: " + mojstos.get(0));
		System.out.println("Drugi element: " + mojstos.get(1));
		System.out.println("Rozmiar stosu: " + mojstos.size() + "\n");

		// System.out.println("Element wykraczajacy poza tablice: " + mojstos.get(102));

	}

}
