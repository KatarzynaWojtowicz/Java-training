package pl.katarzynawojtowicz.collectionstraining.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void shouldAddElementToEndOfStack() {
		// Given
		MyStack<Integer> stack = new MyStack<Integer>();

		// When
		stack.push(2);
		stack.push(3);

		// Then
		assertTrue(stack.size() == 2);
		assertTrue(stack.pop() == 3);
		assertTrue(stack.pop() == 2);
	}
}
