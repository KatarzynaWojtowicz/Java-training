package pl.car;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// int n = input.nextInt();
		Car[] tab = new Car[2];

		Car auto1 = new Car();
		auto1.setMarka("Audi");
		auto1.setNumerRejestracyjny("DGL 846638");
		auto1.setKolor(Kolor.BIALY);
		auto1.setLiczbaMiejsc(5);
		auto1.setPrzebieg(120000);
		auto1.setDataPrzegladu(LocalDate.of(2017, 12, 4));
		tab[0] = auto1;

		// System.out.println(auto1.toString());
		// System.out.println(auto1.needTechnicalReview());

		Car auto2 = new Car();
		auto2.setDataPrzegladu(LocalDate.of(2009, 3, 5));
		auto2.setKolor(Kolor.CZERWONY);
		auto2.setLiczbaMiejsc(5);
		auto2.setMarka("BMW");
		auto2.setNumerRejestracyjny("DTR 675844");
		auto2.setPrzebieg(120000);
		tab[1] = auto2;

		// System.out.println(auto2.toString());
		// System.out.println(auto2.needTechnicalReview());

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString() + " Czy trzeba zrobic przeglad? : " + tab[i].needTechnicalReview());
		}

		input.close();
	}

}
