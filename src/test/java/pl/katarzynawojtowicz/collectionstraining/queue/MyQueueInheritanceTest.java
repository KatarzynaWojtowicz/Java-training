package pl.katarzynawojtowicz.collectionstraining.queue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueInheritanceTest {
	@Test
	public void shouldRemoveFirstElement() throws Exception {

		// Given
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		myQueue.add(6);
		myQueue.add(10);
		myQueue.add(1);

		// When
		myQueue.remove();

		// Then
		String result = myQueue.toString();
		Assert.assertEquals("[10, 1]", result);
	}

}
