package dziedziczenieZadanie;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		List<Vehicle> myList = new ArrayList<Vehicle>();

		Car car1 = new Car("Skoda", Color.BLACK, 4, 6);
		Car car2 = new Car("Opel", Color.BLUE, 5, 3);
		Car car3 = new Car("Audi", Color.GREEN, 5, 7);

		Truck truck1 = new Truck("Renault", 2, Color.RED, 2);
		Truck truck2 = new Truck("Scania", 1, Color.YELLOW, 2);
		Truck truck3 = new Truck("Jelcz", 4, Color.BLACK, 2);

		Motorbike motorbike1 = new Motorbike("Renault", 6, 125);
		Motorbike motorbike2 = new Motorbike("Junak", 4, 125);
		Motorbike motorbike3 = new Motorbike("Honda", 9, 750);

		myList.add(car1);
		myList.add(car2);
		myList.add(car3);
		myList.add(truck1);
		myList.add(truck2);
		myList.add(truck3);
		myList.add(motorbike1);
		myList.add(motorbike2);
		myList.add(motorbike3);

		for (Vehicle x : myList) {
			System.out.println(x);
			x.startEngine();
		}

	}
}
