package by.academy.homework.hw4;

import java.util.Arrays;

//Задание 2.
//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, 
//		нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))

public class Task2<T extends Object> {

	private T[] array; 
	private static final int DEFAULT_CAPACITY = 16;
	private int countElements = 0;

	@SuppressWarnings("unchecked")
	public Task2() {
		super();
		this.array = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@SuppressWarnings("unchecked")
	public Task2(int capacity) {
		super();
		if (capacity > 0) {
			this.array = (T[]) new Object[capacity];
		} else {
			this.array = (T[]) new Object[DEFAULT_CAPACITY];
		}
	}

	public void add(T element) {
		if (array.length == countElements) {
			expandArray();
		}
		array[countElements++] = element;
	}

	@SuppressWarnings("unchecked")
	private void expandArray() {
		T[] tmpProducts = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, tmpProducts, 0, array.length);
		array = tmpProducts;
	}

	// 2) взятие по индексу get(int i)
	public T get(int i) {
		if (i >= 0 && i < countElements) {
			return array[i];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

//	3) взятие последнего элемента getLast()

	public T getLast() {
		return array[countElements - 1];
	}
	// 4) взятие первого элемента getFirst()

	public T getFirst() {
		return array[0];
	}

	// 5) вывод размера массива

	public int arrayLength() {
		return countElements;
	}

	// 6) вывод индекса последнего заполненого элемента (не путать с размерностью)

	public int getIndexLastElement() {
		return countElements - 1;
	}

	// 7) удаление элемента по индексу (remove(int i)

	public boolean remove(int i) {
		if (i < countElements) {
			System.arraycopy(array, i + 1, array, i, countElements - i - 1);
			array[--countElements] = null;
			return true;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	// 8) удаление элемента по значению (remove(T obj))
	public boolean remove(T element) {
		int indexOfElement = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i].equals(element)) {
					indexOfElement = i;
					break;
				}
			}
		}
		if (indexOfElement != -1) {
			System.arraycopy(array, indexOfElement + 1, array, indexOfElement, countElements - indexOfElement - 1);
			array[--countElements] = null;
			return true;
		}
		return false;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getCountElements() {
		return countElements;
	}

	public void setCountElements(int countElements) {
		this.countElements = countElements;
	}

	public static int getDefaultCapacity() {
		return DEFAULT_CAPACITY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + countElements;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task2 other = (Task2) obj;
		if (!Arrays.deepEquals(array, other.array))
			return false;
		if (countElements != other.countElements)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Task2 [array=" + Arrays.toString(array) + ", countElements=" + countElements + ", getLast()="
				+ getLast() + ", getFirst()=" + getFirst() + ", arrayLength()=" + arrayLength()
				+ ", getIndexLastElement()=" + getIndexLastElement() + ", getArray()=" + Arrays.toString(getArray())
				+ ", getCountElements()=" + getCountElements() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
}
