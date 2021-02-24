package by.academy.homework.hw4;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.classwork.lesson11.MinMax;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// task 1

//		Date date1 = new Date();
//		Date date2 = new Date();
//
//		System.out.println("Введите первую дату, формат дд-мм-гггг:");
//
//		Scanner console = new Scanner(System.in);
//
//		date1.setDate(console.next())
////		date1.printDayOfWeek();  // используя красивый метод от java
//
////		date1.dayOfWeek(); // через свой enum
//
//		System.out.println("Введите вторую дату, формат дд-мм-гггг:");
//		date2.setDate(console.next());
//
//		date2.rasschetDneiVPromezhutke(date1.getDate(), date2.getDate());
//
//		console.close();

		// task2
//	
//		Task2<Double> array = new Task2<>(10);
//		array.add(1.2);
//		array.add(1.3);
//		

//		System.out.println("Поcледний индекс: " + array.lastIndex());
//		array.get(5);	
//		array.getFirst();
//		array.getLast();
//		array.remove(1.3);
//		array.remove(0);
//		array.arrayLength();
//			 

		// task3

		Integer[] array = { 1, 2, 3, 4, 5, 6 };
		ArrayItterator<Integer> arrItterator = new ArrayItterator<Integer>(array);

		while (arrItterator.hasNext()) {
			Integer i = arrItterator.next();
			System.out.println(i);
		}

	}

}
