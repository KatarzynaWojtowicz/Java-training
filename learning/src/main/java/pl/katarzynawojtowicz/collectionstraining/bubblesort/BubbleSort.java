package pl.katarzynawojtowicz.collectionstraining.bubblesort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		int[] numbers = new int[4];
		Scanner put = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Put a number: ");
			int element = put.nextInt();
			numbers[i] = element;
		}
		System.out.println("Not sorted: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j - 1] > numbers[j]) {
					int a = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = a;
				}

			}

		}
		System.out.println("\nSorted: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
