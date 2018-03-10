package pl.katarzynawojtowicz.interfaceTraining;

import java.util.Scanner;

import pl.katarzynawojtowicz.interfaceTraining.InterfaceTraining.Figure;

public class Circle implements Figure {
	@Override
	public int getPerimeter() {
		Scanner put = new Scanner(System.in);
		int r;
		System.out.println("Get value of radius: ");
		r = put.nextInt();
		int perimeter = (int) (r * r * 3.14);
		System.out.println("Value of perimeter: ");
		return perimeter;

	}

	@Override
	public int getArea() {
		int r;
		System.out.println("Get value of radius: ");
		Scanner put = new Scanner(System.in);
		r = put.nextInt();
		int area = (int) (2 * r * 3.14);
		System.out.println("Value of area: ");
		return area;
	}

}
