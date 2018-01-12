package pl.katarzynawojtowicz.constructors;

public class ConstructorTesting {

	public static void main(String[] args) {
		System.out.println("Testing 0 argument constructor: ");
		Person p1 = new Employee();

		System.out.println("\nTesting contructor with arguments: ");
		Person p2 = new Employee("John Kowalski", 25, Gender.MALE, 2500, "teacher");
	}

}
