package pl.katarzynawojtowicz.collectionstraining.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("orange");
		fruitList.add("kiwi");

		printList(fruitList);
		deleteElement(fruitList);
	}

	private static void printList(List<String> list) {
		System.out.println("Printing with for: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Printing with foreach: ");
		for (String element : list) {
			System.out.println(element);
		}

		System.out.println("Printing with iterator: ");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	private static void deleteElement(List<String> list) {
		list.add("potatoe");

		System.out.println("Removing with iterator: ");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String nextElement = iter.next();
			if (nextElement.equals("potatoe")) {
				iter.remove();
			}
		}

		for (String element : list) {
			System.out.println(element);
		}
	}

}
