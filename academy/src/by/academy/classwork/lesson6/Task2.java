package by.academy.classwork.lesson6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {

	public static void main(String[] args) {
//		2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//		учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//		текста также могут быть пробелы, но могут и отсутствовать.

		String text = "2. Имеется строка с текстом! Подсчитать количество слов в тексте. "
				+ "Желательно учесть, что слова могут разделяться несколькими пробелами, в "
				+ "начале и конце текста также могут быть пробелы, но могут и отсутствовать?";

		
		String regExp = "\\s+";

		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(text);

		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println(counter);
		
		System.out.println(text.split(regExp).length);
		

	}

}
