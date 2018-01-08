package pl.katarzynawojtowicz.collectionstraining.list;

import java.util.ArrayList;
import java.util.List;

public class ListTraining {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Mouse");
		myList.add("Cat");
		myList.add("Rose");
		myList.add("fish");
		myList.add("Fish");

		System.out.println(myList.size());
		System.out.println(myList);

		myList.remove(1);
		System.out.println("Removed element on index 1: " + myList);

		myList.remove("Rose");
		System.out.println("Removed rose: " + myList);

		String animal = myList.get(0);
		System.out.println("First animal is: " + animal);

	}

}
