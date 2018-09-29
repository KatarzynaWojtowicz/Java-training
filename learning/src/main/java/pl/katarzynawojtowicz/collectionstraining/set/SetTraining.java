package pl.katarzynawojtowicz.collectionstraining.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTraining {
	public static void main(String[] args) {
		hashSetTest();
		linkedHashSetTest();
		treeSetTest();

	}

	private static void treeSetTest() {
		Set<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("onion");
		myTreeSet.add("carrot");
		myTreeSet.add("onion");
		myTreeSet.add("apple");

		System.out.println("TreeSet:");
		System.out.println(myTreeSet.size());
		System.out.println(myTreeSet); // unique, sorted, not insert order
	}

	private static void linkedHashSetTest() {
		Set<String> myLinkedHashSet = new LinkedHashSet<String>();
		myLinkedHashSet.add("Dog");
		myLinkedHashSet.add("Cat");
		myLinkedHashSet.add("Dog");
		myLinkedHashSet.add("Bird");

		System.out.println("LinkedHashSet:");
		System.out.println(myLinkedHashSet.size());
		System.out.println(myLinkedHashSet.toString()); // unique, not sorted, insert order.
	}

	private static void hashSetTest() {
		Set<String> myHashSet = new HashSet<String>();
		myHashSet.add("John");
		myHashSet.add("James");
		myHashSet.add("John");
		myHashSet.add("Kate");
		System.out.println("HashSet:");
		System.out.println(myHashSet.size());
		System.out.println(myHashSet); // unique, not sorted, not insert order.
	}
}
