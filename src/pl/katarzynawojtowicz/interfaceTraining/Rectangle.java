package pl.katarzynawojtowicz.interfaceTraining;

import java.util.Scanner;

import pl.katarzynawojtowicz.interfaceTraining.InterfaceTraining.Figure;

public class Rectangle implements Figure {

	@Override
	public int getPerimeter() {
		Scanner put = new Scanner(System.in);
		int b, c;
		System.out.println("Get value of first side: ");
		b = put.nextInt();
		System.out.println("Get value of second side: ");
		c = put.nextInt();
		int perimeter = (int) ((2 * b) + (2 * c));
		System.out.println("Value of perimeter: ");
		return perimeter;
	}

	@Override
	public int getArea() {
		int a, b;
		System.out.println("Get value of first side: ");
		Scanner put = new Scanner(System.in);
		a = put.nextInt();
		System.out.println("Get value of second side: ");
		b = put.nextInt();
		int area = (a * b);
		System.out.println("Value of area: ");
		return area;
	}

}
