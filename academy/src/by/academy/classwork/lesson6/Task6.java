package by.academy.classwork.lesson6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {

	static Pattern p = Pattern.compile("\\w+@\\w+\\.{1}\\w+");

	public static void main(String[] args) {
		// 6. Написать regexp для email.

		System.out.print("Введите e-mail: ");

		Scanner console = new Scanner(System.in);
		String s = console.nextLine();

		System.out.print(validate(s));
		console.close();
	}

	private static boolean validate(String s) {
		s = s.trim();

		return p.matcher(s).matches();
	}

}
