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
}
