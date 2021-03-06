package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import by.academy.homework.hw4.ArrayIterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 7));
		System.out.println(numbers);
		System.out.println(removeDuplicates(numbers));

			addMilionElement();

		// Задача 4.
		// Создать список оценок учеников с помощью ArryList, заполнить случайными
		// оценками. Найти самую высокую оценку с использованием итератора.

		ArrayList<Integer> marks = new ArrayList<>();
		System.out.println("Введите кол-во оценок ");
		Scanner console = new Scanner(System.in);
		int count = console.nextInt();

		for (int i = 0; i < count; i++) {
			marks.add((int) (Math.random() * 10));
		}

		System.out.println(marks);

		Iterator<Integer> iter = marks.iterator();
		int flag = 0;

		while (iter.hasNext()) {

			Integer element = (Integer) iter.next();
			if (flag < element) {
				flag = element;
			}
		}
		System.out.println(flag);

		console.close();

	}

//	Напишите метод, который на вход получает коллекцию объектов, 
//	а возвращает коллекцию уже без дубликатов.

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

//    Напишите метод, который добавляет 1 000 000 элементов в ArrayList и LinkedList. 
//    Напишите еще один метод, который выбирает из заполненного списка элемент
//    наугад 100000 раз. 
//    Замерьте время, которое потрачено на это. 
//    Сравните результаты и предположите, почему они именно такие

	public static void addMilionElement() {

		ArrayList<Integer> arList = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) {
			arList.add(i);
		}

		LinkedList<Integer> liList = new LinkedList<>();
		for (int i = 0; i <= 1_000_000; i++) {
			liList.add(i);

		}
		long startTime2 = System.currentTimeMillis();
		for (int i2 = 0; i2 < 100; i2++) {
			liList.get((int) (Math.random() * (1_000_000 - 1)));

		}
		System.out.println(System.currentTimeMillis() - startTime2);

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			arList.get((int) (Math.random() * (1_000_000 - 1)));

		}
		System.out.println(System.currentTimeMillis() - startTime);

	}

//	public static <T> void returnElement(ArrayList<?> arList1) {
////		ArrayList<Integer> arList = new ArrayList<>();
//
//		for (int i = 0; i < 100_000; i++) {
//			System.out.println(arList1.get((int) (Math.random() * (1_000_000 - 1))));
//		}
//	}

}
