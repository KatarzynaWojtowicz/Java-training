package kolekcje;

import java.util.AbstractList;

public class Stos<E> extends AbstractList<E> {
	private Object[] tablica = new Object[100];
	private int i = 0;

	@Override
	public boolean add(Object element) {
		tablica[i] = element;
		i++;
		return false;
	}

	@Override
	public E get(int e) {
		System.out.println(e);
		System.out.println(tablica.length);
		if (e > 0 && e < tablica.length) {
			return (E) tablica[e];
		} else {
			throw new RuntimeException("Wyszedles poza tablice!");
		}

	}

	@Override
	public int size() {
		int size = tablica.length;
		return size;
	}

}
