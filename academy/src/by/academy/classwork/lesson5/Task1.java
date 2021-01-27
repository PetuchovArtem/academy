package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.

		String tempStroka;

		System.out.println("Введите строки");

		Scanner consol = new Scanner(System.in);
		String minStroka = consol.nextLine();
		String maxStroka = consol.nextLine();

	
		while (consol.hasNextLine()) {


			tempStroka = consol.nextLine();
			if (tempStroka.equals("end")) {
				break;
			}

			if (tempStroka.length() > maxStroka.length()) {
				maxStroka = tempStroka;
			}
			if (tempStroka.length() < minStroka.length()) {
				minStroka = tempStroka;
			}
		
			consol.nextLine();
			
		}

		System.out.println("Минимальная строка: " + minStroka);
		System.out.println("Мксимальная строка: " + maxStroka);

		consol.close();

	}

}
