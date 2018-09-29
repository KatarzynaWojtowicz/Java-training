package pl.car;

import java.util.ArrayList;
import java.util.List;

public class CarRental {
	List<Car> auta = new ArrayList<Car>();

	public void addCar(Car car) {
		auta.add(car);
	}

	public Car rentCar(Kolor kolor) {
		for (Car c : auta) {
			if (c.getKolor() == kolor) {
				c.setCzyWypozyczony(true);
				return c;
			}

		}
		return null;
	}

	public void returnCar(String numerRejestracyjny) {
		for (Car c : auta) {
			if (c.getNumerRejestracyjny().equals(numerRejestracyjny)) {
				c.setCzyWypozyczony(false);
			}
		}
	}

}
