package by.academy.homework.hw3;

import java.text.ParseException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date date1 = new Date();
		Date date2 = new Date();

		System.out.println("Введите первую дату, формат дд-мм-гггг:");

		Scanner console = new Scanner(System.in);

		date1.setDate(console.next());
//		date1.printDayOfWeek();  // используя красивый метод от java

//		date1.dayOfWeek(); // через свой enum
		
		
		System.out.println("Введите вторую дату, формат дд-мм-гггг:");
		date2.setDate(console.next());
		
//		date2.rasschetDneiVPromezhutke(date1.getDate(), date2.getDate());
		date2.rasschetDneiVPromezhutkeTest(date1.getDate(), date2.getDate());
		
		console.close();
	}

}
