package by.academy.homework.hW2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
//		Получить слово состоящее из первой половины первого слова и второй половины 
//		второго слова.

		Scanner console = new Scanner(System.in);
		String wordFirst;
		String wordSecond;
		
		String wordFirstResult = new String();
		String wordSecondResult = new String();

		System.out.println("Введите 2 слова, состоящих из четного кол-ва букв");

		String text = console.nextLine();

		String[] array = text.split(" ");

		wordFirst = array[0];
		char[] array2 = wordFirst.toCharArray();

		for (int j = 0; j < (wordFirst.length() / 2); j++) {
			char temp = array2[j];
			wordFirstResult += temp;
		}

		wordSecond = array[1];
		char[] array3 = wordSecond.toCharArray();

		for (int m = (wordSecond.length() / 2); m < wordSecond.length(); m++) {
			char temp1 = array3[m];
			wordSecondResult += temp1;
		}

		System.out.println(wordFirstResult + wordSecondResult);

		console.close();
	}
}
