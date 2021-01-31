package by.academy.homework.hw1;

import java.util.Scanner;

public class Task3Hw1 {

	public static void main(String[] args) {

		int counter = 0;
		int a;
		Scanner console = new Scanner(System.in);

		System.out.println("Введите число от 1 до 10 ");
		a = console.nextInt();

		while (a <= 0 || a >= 10) {
			System.out.println("Число " + a + " не удовлетворяет условию. Введите число от 1 до 10");
			a = console.nextInt();
		}
		while (counter <= 10) {
			System.out.println(a * counter);
			counter++;
		}

		console.close();
	}

}
