package pl.zaliczenie.silnia;

import java.util.Scanner;

public class SilniaRekurencyjnie {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Silnia s = new Silnia();
		int wynik = s.silnia(n);
		System.out.println(wynik);
		input.close();

	}
}
