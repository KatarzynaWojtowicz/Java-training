package pl.katarzynawojtowicz.collectionstraining.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ListTrainingTest {
	@Test
	public void shouldRemoveElementOnIndex() throws Exception {

		// Given
		List<String> myList = new ArrayList<String>();
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Mouse");
		myList.add("Rose");

		// When
		myList.remove("Mouse");

		// Then
		String result = myList.toString();
		Assert.assertEquals("[Dog, Cat, Rose]", result);
	}

	@Test
	public void shouldReturnSize() throws Exception {

		// Given
		List<String> myList = new ArrayList<String>();
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Mouse");
		myList.add("Rose");

		// When
		int result = myList.size();

		// Then
		Assert.assertEquals(4, result);
	}

	@Test
	public void getElementOnIndex() throws Exception {

		// Given
		List<String> myList = new ArrayList<String>();
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Mouse");
		myList.add("Rose");

		// When
		String result = myList.get(3);

		// Then
		Assert.assertEquals("Rose", result);
	}

	@Test
	public void shouldRemoveElement() throws Exception {

		// Given
		List<String> myList = new ArrayList<String>();
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Mouse");
		myList.add("Rose");

		// When
		myList.remove("Dog");
		String result = myList.toString();

		// Then
		Assert.assertEquals("[Cat, Mouse, Rose]", result);
	}
}
