package by.academy.classwork.lesson6;

public class Task5 {

	public static void main(String[] args) {
//		5. Дана строка:
//			" Hey      There!     How      Are you doing"   ;
//			оставить лишь 1 пробел между слов.

		String text = " Hey      There!     How      Are you doing";
		String regExp = "\\s+";

		System.out.println(text.replaceAll(regExp, " ").trim());

	}

}
