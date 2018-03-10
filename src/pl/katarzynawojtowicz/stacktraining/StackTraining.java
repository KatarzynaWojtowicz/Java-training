package pl.katarzynawojtowicz.stacktraining;

public class StackTraining {
public static void main(String[] args) {
	MyStack<Integer> myStack = new MyStack<Integer>();
	
	myStack.push(5);
	myStack.push(99);
	myStack.push(102);
	myStack.push(-6);
	
	myStack.view();
	
	myStack.pop();
	
	myStack.view();
	myStack.size();
}
}
