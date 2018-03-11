package pl.katarzynawojtowicz.collectionstraining.queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueue <E>{
	private List<E> list;
	public MyQueue() {
		list = new LinkedList<E>();
	}
	public void add(E element) {
		list.add(element);
	}
	
	public E remove() {
		return list.remove(0);
	}
	
	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}

