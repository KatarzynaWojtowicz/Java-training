package Exceptions;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		System.out.println("Aby dodac liczby wpisz ADD");
		System.out.println("Aby odjac liczby wpisz SUB");
		System.out.println("Aby podzielic wpisz DIV");

		String choice = input.nextLine();
		System.out.println("Wpisz pierwsza liczbe: ");
		double a = input.nextDouble();
		System.out.println("Wpisz druga liczbe: ");
		double b = input.nextDouble();
		input.close();
		Program program = new Program();

		if (choice.equals("ADD")) {
			double result = program.add(a, b);
			System.out.println("> " + choice + " " + a + " " + b + " " + "\nresult = " + result);
		}

		if (choice.equals("SUB")) {
			double result = program.sub(a, b);
			System.out.println("> " + choice + " " + a + " " + b + " " + "\nresult = " + result);
		}
		if (choice.equals("DIV")) {
			double result = program.div(a, b);
			System.out.println("> " + choice + " " + a + " " + b + " " + "\nresult = " + result);
		}
	}
}
