package by.academy.homework;

import java.util.Scanner;

public class Task2Hw1 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Введите тип переменной. Доступные типы: integer, double, float, char, String");
		String dataType = a.nextLine();
		switch (dataType) {
		case ("integer"):
			System.out.println("Введите переменную типа integer");
			int a1 = a.nextInt();
			System.out.println(a1 % 2);
			break;
		case ("double"):
			System.out.println("Введите переменную типа double");
			double a2 = a.nextDouble();
			System.out.println(a2 * 0.7);
			break;
		case ("float"):
			System.out.println("Введите переменную типа float");
			float a3 = a.nextFloat();
			System.out.println(a3 * a3);
			break;
		case ("char"):
			System.out.println("Введите переменную типа char");
			char a4 = a.next().charAt(0);
			System.out.println((int) a4);
			break;
		case ("String"):
			System.out.println("Введите переменную типа String");
			String a5 = a.next();
			System.out.println("Hello " + a5);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
		a.close();

	}
}
