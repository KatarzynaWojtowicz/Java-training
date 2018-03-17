package pl.katarzynawojtowicz.collectionstraining.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void shouldAddElementToEndOfStack() {
		// Given
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(2);

		// When
		stack.push(3);

		// Then
		assertTrue(stack.size() == 2);
		assertTrue(stack.get(1) == 3);
	}

	@Test
	public void shouldRemoveElementAfterPop() {
		// Given
		MyStack<String> stack = new MyStack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		// when
		String result = stack.pop();

		// Then
		assertTrue(result.equals("C"));
		assertTrue(stack.size() == 2);
	}

	@Test
	public void shouldConvertStackToString() {
		// Given
		MyStack<String> stack = new MyStack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		// When
		String result = stack.toString();

		// Then
		assertTrue(result.equals("[A, B, C]"));
	}
}
