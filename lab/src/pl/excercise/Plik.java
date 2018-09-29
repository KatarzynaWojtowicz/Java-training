package pl.excercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Plik {
	String dane;
	String dane1;

	public void czytaj_dane() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imie i nazwisko: ");
		dane = sc.nextLine();
		sc.close();
	}

	public void zapisz_dane_do_pliku() throws IOException {
		System.out.println("Zapis danych do pliku dane.txt.");
		FileWriter fw = new FileWriter("dane.txt");
		fw.write(dane);
		fw.close();
	}

	public void czytaj_dane_z_pliku() throws IOException {
		System.out.println("Odczyt danych z pliku dane.txt: ");
		System.out.println();
		FileReader fr = new FileReader("dane.txt");

		BufferedReader br = new BufferedReader(fr);
		while ((dane1 = br.readLine()) != null)
			System.out.println(dane1);
		fr.close();
		br.close();
	}
}
