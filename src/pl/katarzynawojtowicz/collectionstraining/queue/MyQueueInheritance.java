package pl.katarzynawojtowicz.collectionstraining.queue;

import java.util.ArrayList;

public class MyQueueInheritance<E> extends ArrayList<E> {
	
	public E remove() {
		return this.remove(0);
	}
	
}