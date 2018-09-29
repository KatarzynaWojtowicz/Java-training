package pl.excercise;

import java.util.Scanner;

public class Trojmian {
	double a;
	double b;
	double c;
	double delta;
	double x1;
	double x2;
	int liczba_pierwiastkow;

	public void czytaj_dane() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj a: ");
		a = sc.nextDouble();

		if (a == 0) {
			System.out.println("a nie moze byc rowne 0!");
			System.exit(1);
		} else {
			System.out.println("Podaj b: ");
			b = sc.nextDouble();
			System.out.println("Podaj c: ");
			c = sc.nextDouble();
			sc.close();
		}

	}

	public void przetworz_dane() {
		delta = b * b - 4 * a * c;
		if (delta < 0)
			liczba_pierwiastkow = 0;
		if (delta == 0)
			liczba_pierwiastkow = 1;
		if (delta > 0)
			liczba_pierwiastkow = 2;

		switch (liczba_pierwiastkow) {
		case 1: {
			x1 = -b / (2 * a);
		}
			break;
		case 2: {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
		}
			break;
		}
	}

	public void wyswietl_wyniki() {

		switch (liczba_pierwiastkow) {
		case 0:
			System.out.println("Zero pierwiastkow rzeczywistych.");
			break;
		case 1:
			System.out.println("Jeden pierwiastek: ");
			System.out.printf("x = " + "%2.2f.\n", x1);
			break;
		case 2:
			System.out.println("Dwa pierwiastki: ");
			System.out.printf("x1 = " + "%2.2f.\n", x1);
			System.out.printf("x2 = " + "%2.2f.\n", x2);
			break;
		}

	}
}
