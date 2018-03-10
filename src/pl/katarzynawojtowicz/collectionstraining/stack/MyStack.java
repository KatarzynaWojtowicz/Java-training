package pl.katarzynawojtowicz.collectionstraining.stack;

import java.util.LinkedList;

public class MyStack <E> {
	private LinkedList<E> list;
	
	public MyStack() {
		list = new LinkedList<E>();
	}
	
	void push(E element) {
		list.add(element);
	}
	
	public E pop() {
		return list.removeLast();
	}

	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return this.list.toString();
	}
	
}
