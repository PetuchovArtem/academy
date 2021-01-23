package by.academy.lesson4.classwork;

public class Task12 {

	public static void main(String[] args) {

		int result = 1;

		// 12. Найти произведение двузначных нечетных чисел кратных 13.

		for (int i = 10; i < 100; i++) {
			if (i % 2 == 1 && i % 13 == 0) {
				result *= i;

			}
		}
		System.out.println("Произведение равно " + result);
	}
}