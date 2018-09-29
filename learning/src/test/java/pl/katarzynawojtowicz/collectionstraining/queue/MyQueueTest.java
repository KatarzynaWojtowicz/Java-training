package pl.katarzynawojtowicz.collectionstraining.queue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void shouldAddElementToEndOfQueue() throws Exception {

		// Given
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.add(5);
		queue.add(8);

		// When
		queue.add(9);
		String resultString = queue.toString();

		// Then
		Assert.assertEquals("[5, 8, 9]", resultString);
	}

	@Test
	public void shouldRemoveFirstElement() throws Exception {

		// Given
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.add(5);
		queue.add(8);
		queue.add(1);

		// When
		queue.remove();

		// Then
		String resultString = queue.toString();
		Assert.assertEquals("[8, 1]", resultString);
	}

	@Test
	public void shouldReturnSize() throws Exception {

		// Given
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.add(5);
		queue.add(8);
		queue.add(1);

		// When
		int result = queue.size();

		// Then
		Assert.assertEquals(3, result);
	}

}
