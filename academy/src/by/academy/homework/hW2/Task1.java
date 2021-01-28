package by.academy.homework.hW2;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

//		Ввести две строки с консоли. Определить, является ли 
//		одна строка перестановкой символов другой строки. Учитываем регистр. 
//		Не использовать сортировку :) 
//	    Например: 
//	    1.	“hello” и “hlleo” -> true
//	    2.	“hello” и “art” -> false

		String stroka1;
		String stroka2;

		int length1;
		int length2;

		Scanner console = new Scanner(System.in);

		System.out.println("Введите первую строку");
		stroka1 = console.nextLine();
		System.out.println("Введите вторую строку");
		stroka2 = console.nextLine();

		length1 = stroka1.length();
		length2 = stroka2.length();

		char[] array1 = stroka1.toCharArray();
		char[] array2 = stroka2.toCharArray();

		if (length1 == length2) {
			boolean temp3 = false;
			for (int i = 0; i < array1.length; i++) {
				int temp1 = array1[i];
				temp3 = false;

				for (int j = 0; j < array2.length; j++) {
					int temp2 = array2[j];

					if (temp1 == temp2) {
						temp3 = true;
						break;
					}
				}
				if (temp3 == false) {
					System.out.println("false");
					break;
				}
			}
			if (temp3 == true) {
				System.out.println("true");
			}
		} else {
			System.out.println(false);
		}
		console.close();
	}
}
