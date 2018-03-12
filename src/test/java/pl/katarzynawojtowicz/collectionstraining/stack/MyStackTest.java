package pl.katarzynawojtowicz.collectionstraining.stack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyStackTest extends TestCase {

	public MyStackTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(MyStackTest.class);
	}

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
