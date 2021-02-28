package by.academy.homework.hw4;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// task 1
		System.out.println("Task1");
		Date date1 = new Date();
		Date date2 = new Date();

		System.out.println("Введите первую дату, формат дд-мм-гггг:");

		Scanner console = new Scanner(System.in);

		date1.setDate(console.next());
//		date1.printDayOfWeek();  

		date1.dayOfWeek();

		System.out.println("Введите вторую дату, формат дд-мм-гггг:");
		date2.setDate(console.next());

		System.out.println(date1.getDaysBetweenTwoDates(date2));
		System.out.println(date1.vesGod());

		// task2
		System.out.println();
		System.out.println("Task2");
		Task2<Integer> array = new Task2<>(2);
		array.add(1);
		array.add(2);
		array.add(3);
		System.out.println(array.get(0));
		System.out.println(array.getLast());
		System.out.println(array.getFirst());
		System.out.println(array.arrayLength());
		System.out.println(array.getIndexLastElement());
		System.out.println(array.remove(Integer.valueOf(1)));
		System.out.println(array.remove(1));
		System.out.println(array.getLast());
		System.out.println(array.arrayLength());

		// task3
		System.out.println();
		System.out.println("Task3");
		Integer[][] array1 = { { 1, 2, 3, 4 }, { 3, 2, 1 }, { 2, 3, 4 } };
		ArrayIterator<Integer> arrIterator = new ArrayIterator<>(array1);

		while (arrIterator.hasNext()) {
			System.out.print(arrIterator.next());
		}
		console.close();

	}

}
