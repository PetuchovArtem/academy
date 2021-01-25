package by.academy.homework.hW2;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
//		Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
//		Получить слово состоящее из первой половины первого слова и второй половины 
//		второго слова.

		Scanner console = new Scanner(System.in);
		String wordFirst;
		String wordSecond;
		String wordFirstResult = "";
		String wordSecondResult = "";

		System.out.println("Введите 2 слова, состоящих из четного кол-ва букв");

		String text = console.nextLine();

		String[] array = text.split(" ");
//		System.out.println(Arrays.toString(array));

		wordFirst = array[0];
		char[] array2 = wordFirst.toCharArray();

		for (int j = 0; j < (wordFirst.length() / 2); j++) {
//			System.out.println(j);
			char temp = array2[j];
			wordFirstResult += temp;
		}

//		System.out.println(wordFirstResult);

		wordSecond = array[1];
		char[] array3 = wordSecond.toCharArray();

		for (int m = (wordSecond.length() / 2); m < wordSecond.length(); m++) {
//			System.out.println(m);
			char temp1 = array3[m];
			wordSecondResult += temp1;
		}

//		System.out.println(wordSecondResult);
		System.out.println(wordFirstResult + wordSecondResult);

		console.close();
	}
}
