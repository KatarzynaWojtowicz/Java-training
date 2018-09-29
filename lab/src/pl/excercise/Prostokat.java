package pl.excercise;

import java.util.Scanner;

public class Prostokat {
	double a;
	double b;
	double pole;

	public void czytaj_dane() {
		System.out.println("Podaj dlugosc boku: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		System.out.println("Podaj dlugosc drugiego boku: ");
		b = scan.nextDouble();
		scan.close();
	}

	public void przetworz_dane() {
		pole = a * b;
	}

	public void wyswietl_wynik() {
		System.out.println(pole);
	}

}
