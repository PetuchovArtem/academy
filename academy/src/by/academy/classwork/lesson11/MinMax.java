package by.academy.classwork.lesson11;

import java.util.Arrays;

public class MinMax<T extends Number> {

//	8.	Написать обобщенный класс MinMax, который содержит методы для нахождения 
//	минимального и максимального элемента массива. Массив является переменной класса. 
//	Массив должен передаваться в класс через конструктор.

	public T[] array;
	T min;
	T max;

	public MinMax(T[] array) {
		this.setArray(array);
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T getMin() {
		T flag = array[0];
		for (int count = 0; count < array.length; count++) {
			if (Double.compare(flag.doubleValue(), array[count].doubleValue()) < 0) {
				flag = array[count];
			}
		}
		return flag;
	}

	public T getMax() {
		T flag2 = array[0];
		for (int count2 = 0; count2 < array.length; count2++) {
			if (Double.compare(flag2.doubleValue(), array[count2].doubleValue()) > 0) {
				flag2 = array[count2];
			}
		}
		return flag2;
	}

	@Override
	public String toString() {
		return "MinMax [array=" + Arrays.toString(array) + ", getArray()=" + Arrays.toString(getArray())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
