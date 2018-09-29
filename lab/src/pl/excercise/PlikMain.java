package pl.excercise;

import java.io.IOException;

public class PlikMain {
	public static void main(String[] args) throws IOException {
		Plik plik = new Plik();
		plik.czytaj_dane();
		plik.zapisz_dane_do_pliku();
		plik.czytaj_dane_z_pliku();
	}
}
