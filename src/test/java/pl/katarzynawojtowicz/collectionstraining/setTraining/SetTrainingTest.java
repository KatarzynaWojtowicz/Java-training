package pl.katarzynawojtowicz.collectionstraining.setTraining;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class SetTrainingTest {
	@Test
	public void treeSetTest() throws Exception {

		// Given
		Set<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("onion");
		myTreeSet.add("carrot");
		myTreeSet.add("onion");
		myTreeSet.add("apple");

		// When
		int resultSize = myTreeSet.size();
		String resultString = myTreeSet.toString();

		// Then
		Assert.assertEquals(3, resultSize);
		Assert.assertEquals("[apple, carrot, onion]", resultString);
	}

	@Test
	public void linkedHashSetTest() throws Exception {

		// Given
		Set<String> myLinkedHashSet = new LinkedHashSet<String>();
		myLinkedHashSet.add("Dog");
		myLinkedHashSet.add("Cat");
		myLinkedHashSet.add("Dog");
		myLinkedHashSet.add("Bird");

		// When
		int resultSize = myLinkedHashSet.size();
		String resultString = myLinkedHashSet.toString();

		// Then
		Assert.assertEquals(3, resultSize);
		Assert.assertEquals("[Dog, Cat, Bird]", resultString);
	}

	@Test
	public void hashSetTest() throws Exception {

		// Given
		Set<String> myHashSet = new HashSet<String>();
		myHashSet.add("John");
		myHashSet.add("James");
		myHashSet.add("John");
		myHashSet.add("Kate");

		// When
		int resultSize = myHashSet.size();
		String resultString = myHashSet.toString();

		// Then
		Assert.assertEquals(3, resultSize);
		Assert.assertEquals("[James, Kate, John]", resultString);
	}

}
