package by.academy.homework.hW2;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

//		Ввести n слов с консоли. Найти слово, в котором число различных 
//		символов минимально. Если таких слов несколько, найти первое из них.

		String word;
		String wordMin = null;
		int tempWord = Integer.MAX_VALUE;

		int counter = Integer.MAX_VALUE;

		System.out.println("Введите строку");
		Scanner console = new Scanner(System.in);

		String stroka = console.nextLine();
		String[] array = stroka.split(" ");

		for (int i = 0; i < array.length; i++) {
			word = array[i];

			char[] array2 = word.toCharArray();

			int uniqueChars = array2.length;
			for (int j = 0; j < array2.length; j++) {
				char temp = array2[j];
				for (int n = j + 1; n < array2.length; n++) {
					if (temp == array2[n]) {
						uniqueChars--;
						temp = array2[j];
						break;
					}
				}
				if (temp != array2[j]) {
					continue;
				}
			}
			counter = uniqueChars;

			if (tempWord > counter) {
				wordMin = array[i];
				tempWord = counter;
			}
		}

		System.out.println(wordMin);
		console.close();
	}
}
