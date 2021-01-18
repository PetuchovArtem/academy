package by.academy.homework;

import java.util.Scanner;

public class Task3Hw1 {

	public static void main(String[] args) {

		int counter = 0;
		int a;
		Scanner console = new Scanner(System.in);

		System.out.println("Введите число от 1 до 10 ");
		a = console.nextInt();

		if (a >= 0 && a <= 10) {

			while (counter != 11) {
				System.out.println(a * counter);
				counter++;
			}

		} else {
			System.out.println("Число " + a + " не удовлетворяет условию. Введите число от 1 до 10");
		}
		console.close();
	}

}
