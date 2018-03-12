package pl.katarzynawojtowicz.collectionstraining.stack;

import java.util.ArrayList;

public class MyStackInheritance<E> extends ArrayList<E> {
	
	public void push(E e) {
		this.add(e); 
	}
	
	public E pop() {
		return this.remove(this.size() - 1);
	}
}
