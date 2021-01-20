package by.academy.lesson3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("Введите первое число");
		int a1 = a.nextInt();
		System.out.println("Введите второе число");
		int a2 = a.nextInt();

		if (a1 > a2) {
			System.out.println("Максимальное число " + a1);
		} else if (a1<a2){
			System.out.println("Максимальное число " + a2);
		} else if (a1 == a2) {
			System.out.println("Числа равны");
		}
		System.out.println("Среднее арифметическое " + ((double) (a1 + a2) / 2));
		a.close();
	}

}
