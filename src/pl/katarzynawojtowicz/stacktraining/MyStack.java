package pl.katarzynawojtowicz.stacktraining;

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

	public void view() {
		System.out.println(list);
	}
	
	public void size() {
		System.out.println(list.size());
	}
}
