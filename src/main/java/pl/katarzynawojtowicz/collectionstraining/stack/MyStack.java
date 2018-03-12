package pl.katarzynawojtowicz.collectionstraining.stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack <E> {
	private List<E> list;
	
	public MyStack() {
		list = new LinkedList<E>();
	}
	
	void push(E element) {
		list.add(element);
	}
	
	public E pop() {
		return list.remove(list.size() - 1);
	}

	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return this.list.toString();
	}
	
}
