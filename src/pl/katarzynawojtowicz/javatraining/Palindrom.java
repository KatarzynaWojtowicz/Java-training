package pl.katarzynawojtowicz.javatraining;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text = input.nextLine();

		boolean isPalindrom = true;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				isPalindrom = false;
			}
		}
		System.out.println(isPalindrom);
		input.close();
	}
}
