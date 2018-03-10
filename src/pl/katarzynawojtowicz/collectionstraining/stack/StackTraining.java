package pl.katarzynawojtowicz.collectionstraining.stack;

public class StackTraining {
public static void main(String[] args) {
	MyStack<Integer> myStack = new MyStack<Integer>();
	
	myStack.push(5);
	myStack.push(99);
	myStack.push(102);
	myStack.push(-6);
	
	System.out.println(myStack.toString());
	
	System.out.println(myStack.pop());
	
	System.out.println(myStack.toString());
	System.out.println(myStack.size());
}
}
