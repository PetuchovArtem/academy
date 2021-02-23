package by.academy.homework.hw4;

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

	protected T[] Array;
	protected int i;
	protected T item;

	@SuppressWarnings("unchecked")
	Task2() {
		super();
		this.Array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	Task2(int i) {
		super();
		this.Array = (T[]) new Object[i];
	}

	//// 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что
	//// если массив заполнен,
//	нам нужно его расширить с помощью Arrays.copyOf)

	// еще не доделан
	
	public void add(T item) {

		for (int a = 0; a < Array.length; a++) {
//			if (Array[Array.length - 1] != null) {
//				T[] Array2 =  (T[]) new Object[Array.length * 2 + 1];
//				System.arraycopy(Array, 0, Array2, 0, Array.length);
//				Array = (T[]) Array2;
//			}
			if (Array[a] == null) {
				Array[a] = item;
				break;
			}
		}
	}

	// 2) взятие по индексу get(int i)
	public void get(int i) {
		T getItem = Array[i];
		System.out.println("Элемент равен " + getItem);
	}

//	3) взятие последнего элемента getLast()

	public void getLast() {
		T getLastItem = null;
		for (int c = Array.length; c > Array.length; c--) {
			if (Array[c] != null) {
				getLastItem = Array[c];
				break;
			}
		}
		System.out.println("Последний элемент " + getLastItem);
	}

	// 4) взятие первого элемента getFirst()

	public void getFirst() {
		T getLastItem = Array[0];
		System.out.println("Первый элемент элемент " + getLastItem);
	}

	// 5) вывод размера массива

	public void arrayLength() {
		System.out.println("Размер массива " + Array.length);
	}

	// 6) вывод индекса последнего заполненого элемента (не путать с размерностью)

	public void lastIndex() {
		int k;
		for (k = 0; k < Array.length; k++) {
			if (Array[k] == null) {
				break;
			}
		}
		System.out.println("Последний заполненный элемент " + (k - 1));
	}

	// 7) удаление элемента по индексу (remove(int i)
	public void remove(int i) {
		Array[i] = null;
		System.out.println("Элемент с индексом " + i + " удалён");
	}

	// 8) удаление элемента по значению (remove(T obj))
	public void remove(T obj) {
		for (int m = 0; m < Array.length; m++) {
			if (Array[m] == obj) {
				Array[m] = null;
				break;
			}
		}
		System.out.println("Элемент с значением " + obj + " удалён");
	}

	public T[] getArray() {
		return Array;
	}

	public void settArray(T[] Array) {
		this.Array = Array;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
