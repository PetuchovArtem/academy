package by.academy.homework.hW2;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

//		Ввести n слов с консоли. Найти слово, в котором число различных 
//		символов минимально. Если таких слов несколько, найти первое из них.

		String word;
		int counter = 1;

		System.out.println("Введите строку");
		Scanner console = new Scanner(System.in);

		String stroka = console.nextLine();

		String[] array = stroka.split(" ");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) { // берем наш массив и с каждоt слово перегоняем word

			word = array[i];
			// System.out.println(word);

			char[] array2 = word.toCharArray(); // создаем новый массив из слова word
			char temp = array2[0];
			int uniqueChars = array2.length;
			for (int j = 1; j < array2.length; j++) { // проходим по всем буквам, считаем уникальные
					
				еще должен быть один фор, который сравнивает
				а первый фор просто проходит
				
				if (temp == array2[j]) {
						uniqueChars--;
						temp=array2[j];
						System.out.println(uniqueChars);
						} 
					 
				temp = array2[j];
				System.out.println(uniqueChars);
			}

		}

		console.close();

	}

}
