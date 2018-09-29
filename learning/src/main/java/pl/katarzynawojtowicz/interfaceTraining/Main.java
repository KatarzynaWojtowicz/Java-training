package pl.katarzynawojtowicz.interfaceTraining;

public class Main {
	public static void main(String[] args) {
		System.out.println("Cirlce\n");
		Circle newCircle = new Circle();
		double a = newCircle.getPerimeter();
		System.out.println(a);
		double b = newCircle.getArea();
		System.out.println(b);

		System.out.println("\nRectangle\n");
		Rectangle newRectangle = new Rectangle();
		double c = newRectangle.getPerimeter();
		System.out.println(c + "\n");
		double d = newRectangle.getArea();
		System.out.println(d + "\n");

	}

}
