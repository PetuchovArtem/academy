package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Задача 1.
		System.out.println("Task1: ");
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 7));
		System.out.println(numbers);
		System.out.println(removeDuplicates(numbers));

		// Задача 2.
		System.out.println("Task2: ");
		addMilionElement();

		// Задача 4.

		System.out.println("Task4: ");
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

//		Задача 5. 

		System.out.println("Tak 5: ");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String text = "tessst";
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			Integer count1 = map.get(c);
			if (count1 != null) {
				map.put(c, ++count1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

		// задача 6
		task6();

	}

//	Задача 6.

	public static void task6() {
		System.out.println("Task6: ");

		try {
			int[] array1 = new int[8];
			array1[0] = 1;
			array1[1] = 2;
			array1[2] = 3;
			array1[3] = 4;
			array1[4] = 5;
			array1[5] = 6;
			array1[6] = 7;
			array1[7] = 8;
			array1[8] = 9;
			array1[9] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}

	}

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

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
		System.out.println("LinkedList time: ");
		for (int i2 = 0; i2 < 100; i2++) { // беру 100 раз, т.к. у меня ноутбук умирает, если брать 100_000
			liList.get((int) (Math.random() * (1_000_000 - 1)));

		}
		System.out.println(System.currentTimeMillis() - startTime2);

		long startTime = System.currentTimeMillis();
		System.out.println("ArrayList time: ");
		for (int i = 0; i < 100; i++) { // беру 100 раз, т.к. у меня ноутбук умирает, если брать 100_000
			arList.get((int) (Math.random() * (1_000_000 - 1)));

		}
		System.out.println(System.currentTimeMillis() - startTime);

	}

}
