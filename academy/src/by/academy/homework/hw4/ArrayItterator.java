package by.academy.homework.hw4;

import java.util.Iterator;

public class ArrayItterator<T> implements Iterator<T> {

	private T[] array;
	private int cursor = 0;

	public ArrayItterator(T[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (cursor >= array.length || array == null) {
			return false;
		}
		if (array[cursor] == null) {
			return false;
		}
		return array[cursor] != null;
	}

	@Override
	public T next() {
		return array[cursor++];
	}

}
