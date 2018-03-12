package pl.katarzynawojtowicz.collectionstraining.stack;

public class StackTraining {
	public static void main(String[] args) {
		stackWithComposition();
		stackWithInheritance();
	}

	private static void stackWithInheritance() {
		MyStackInheritance<Integer> myStack = new MyStackInheritance<Integer>();

		myStack.push(5);
		myStack.push(99);
		myStack.push(102);
		myStack.push(-6);

		System.out.println(myStack.toString());
		System.out.println("Size: " + myStack.size());

		System.out.println("Remove: " + myStack.pop());

		System.out.println(myStack.toString());
		System.out.println("Size: " + myStack.size());
	}

	private static void stackWithComposition() {
		MyStack<Integer> myStack = new MyStack<Integer>();

		myStack.push(5);
		myStack.push(99);
		myStack.push(102);
		myStack.push(-6);

		System.out.println(myStack.toString());
		System.out.println("Size: " + myStack.size());

		System.out.println("Remove: " + myStack.pop());

		System.out.println(myStack.toString());
		System.out.println("Size: " + myStack.size());
	}
}
