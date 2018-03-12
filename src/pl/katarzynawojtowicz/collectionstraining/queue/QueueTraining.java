package pl.katarzynawojtowicz.collectionstraining.queue;

public class QueueTraining {
	public static void main(String[] args) {
		queueWithComposition();
		queueWithInheritance();
}


public static void queueWithComposition() {
	MyQueue<Integer> myQueue = new MyQueue<Integer>();
	myQueue.add(45);
	myQueue.add(8);
	myQueue.add(-16);
	myQueue.add(25);
	
	System.out.println(myQueue.toString());
	System.out.println("Size: " + myQueue.size());
	
	System.out.println("Remove: " + myQueue.remove());
	
	System.out.println(myQueue.toString());
	System.out.println("Seize: " + myQueue.size());
}

public static void queueWithInheritance() {
	MyQueue<Integer> myQueue = new MyQueue<Integer>();
	myQueue.add(45);
	myQueue.add(8);
	myQueue.add(-16);
	myQueue.add(25);
	
	System.out.println(myQueue.toString());
	System.out.println("Size: " + myQueue.size());
	
	System.out.println("Remove: " + myQueue.remove());
	
	System.out.println(myQueue.toString());
	System.out.println("Seize: " + myQueue.size());
}
}