package KlasyAbstrakcyjne;

public class Demo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(15, 30);
		Circle circle = new Circle();
		circle.r = 46;
		Square square = new Square(20, 20);

		System.out.println("Rectangle: " + rectangle.getPerimeter() + "\n" + rectangle.getSurface());

		System.out.println("Circle: " + circle.getPerimeter() + "\n" + circle.getSurface());

		System.out.println("Square: " + square.getPerimeter() + "\n" + square.getSurface());

	}

}
