package by.academy.classwork.lesson6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {

	public static void main(String[] args) {
//		1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//		общее их количество

		String text = "2. Имеется строка с текстом! Подсчитать количество слов в тексте. "
				+ "Желательно учесть, что слова могут разделяться несколькими пробелами, в "
				+ "начале и конце текста также могут быть пробелы, но могут и отсутствовать?";

		String regEx = "[\\.,!?;]";
		Pattern p = Pattern.compile(regEx);
//		System.out.println(p);
		Matcher m = p.matcher(text);
//		System.out.println(m);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.print(text.substring(m.start(), m.end()));
		}

		System.out.println();
		System.out.println(count);
	}

}
