package pl.random;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[] tab = generujTablice(n);

		wypiszTablice("Wszystkie wylosowane elementy", tab);
		wypiszMax(tab);

		wypiszMin(tab);
		wypiszSrednia(tab);

		input.close();

	}

	private static void wypiszMin(int[] tab) {
		int min = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (min > tab[i]) {
				min = tab[i];
			}
		}
		System.out.println("Minimalna wartosc to: " + min);
	}

	private static void wypiszMax(int[] tab) {
		int max = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i]) {
				max = tab[i];
			}
		}
		System.out.println("Maksymalna wartosc to: " + max);
	}

	private static int[] generujTablice(int n) {
		int[] tab = new int[n];
		java.util.Random generator = new java.util.Random();
		for (int i = 0; i < n; i++) {
			tab[i] = generator.nextInt(n);
		}
		return tab;
	}

	private static void wypiszTablice(String przedrostek, int[] wartosci) {
		System.out.print(przedrostek + ": ");
		for (int i = 0; i < wartosci.length; i++) {
			System.out.print(wartosci[i] + ", ");
		}
		System.out.println();

	}

	private static void wypiszSrednia(int[] tab) {
		int suma = 0;
		for (int i = 0; i < tab.length; i++) {
			suma = suma + tab[i];
		}

		double wynik = suma / (double) tab.length;
		System.out.println("Srednia arytmetyczna wynosi: " + wynik);

	}
}
