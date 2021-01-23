package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

//		 В сберкассу на трёхпроцентный вклад положили S рублей.
//		 Какой станет сумма вклада через N лет.
		System.out.println("Введите сумму: ");

		Scanner num = new Scanner(System.in);

		double money;
		money = num.nextDouble();

		System.out.println("Введите кол-во лет: ");
		int years;
		years = num.nextInt();

		for (int i = 0; i != years; i++) {
			money *= 1.03;
		}

		System.out.println("Cумма вклада после " + years + " лет, будет равно " + money);
		num.close();

	}

}
