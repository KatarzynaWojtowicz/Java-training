package pl.excercise;

import java.util.Scanner;

public class SilniaRekMain {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		SilniaRek silnia = new SilniaRek();
		System.out.println("Podaj n: ");

		n = sc.nextInt();
		sc.close();

		for (int i = 0; i <= n; i++) {
			System.out.println(i + "! = " + silnia.silnia(i));
		}

	}

}
