package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

//		15. Написать программу, 
//		которая по заданным значениям чисел a и b находит a в степени b. 
//		В запросе укажите допустимые значения этих переменных
//		( Например если а - дробное, то b не может быть отрицательным).

		System.out.println("Введите первое числа");
		double a1;
		double a2;
		double result;

		Scanner num = new Scanner(System.in);
		a1 = num.nextDouble();
		if (a1 % 1 != 0) {
			System.out.println("Введите второе числе, второе число не может быть отрицательным");
			a2 = num.nextInt();
		} else {
			System.out.println("Введите второе числе");
			a2 = num.nextDouble();
		}

		result = Math.pow(a1, a2);
		System.out.println(result);
		num.close();
	}

}
