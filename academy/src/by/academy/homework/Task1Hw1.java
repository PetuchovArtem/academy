package by.academy.homework;

import java.util.Scanner;

public class Task1Hw1 {

	public static void main(String[] args) {

		int age;
		double price;
		Scanner console = new Scanner(System.in);

		System.out.println("Введите сумму покупки ");
		price = console.nextDouble();
		System.out.println("Введите Ваш возраст ");
		age = console.nextInt();

		if (price < 100) {
			price = price * 0.95;
		} else if (price >= 100 && price < 200) {
			price = price * 0.93;
		} else if (price >= 200 && price < 300) {
			if (age > 18)
				price = price * 0.84;
			else
				price = price * 0.91;
		} else if (price >= 300 && price < 400) {
			price = price * 0.85;
		} else if (price >= 400) {
			price = price * 0.8;
		}
		console.close();
		System.out.println("Финальная цена " + price);

	}

}
