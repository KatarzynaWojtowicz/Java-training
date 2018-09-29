package pl.katarzynawojtowicz.lab;

import java.util.Scanner;

public class zad {
	public static void main(String[] args) {
		// String[] parametr = new String[2];
		Scanner put = new Scanner(System.in);
		// parametr[0] = put.nextLine();
		// parametr[1] = put.nextLine();
		// int N = put.nextInt();
		// System.out.println(parametr[0]);
		// System.out.println(parametr[1]);
		//
		// for (int i = 2; i < N; i++) {
		// parametr[3] =
		// System.out.println(parametr[i - 2] + parametr[i - 1]);
		// }
		// put.close();

		String a = put.next();
		String b = put.next();
		int N = put.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < N; i++) {
			System.out.println(a + b);
		}
		put.close();

	}
}
