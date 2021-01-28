package by.academy.classwork.lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task1test1 {

	public static void main(String[] args) {

		System.out.println("Введите кол-во строк: ");
		Scanner console = new Scanner(System.in);

		int n = console.nextInt();

		String[] arr = new String[n];

		System.out.println("Введите строки: ");
		console.nextLine();
		for (int i = 0; i < n; i++) {
				arr[i] = console.nextLine();
//			
		}

		String minStroka = arr[0];
		String maxStroka = arr[0];

		for (int j = 0; j < n; j++) {
			if (minStroka.length() > arr[j].length()) {
				minStroka = arr[j];
			}
			if (maxStroka.length() < arr[j].length()) {
				maxStroka = arr[j];
			}

		}

		System.out.println("Минимальная строка: " + minStroka);
		System.out.println("Мксимальная строка: " + maxStroka);

		console.close();
	}

}
