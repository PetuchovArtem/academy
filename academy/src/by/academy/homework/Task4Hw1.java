package by.academy.homework;

public class Task4Hw1 {

	public static void main(String[] args) {
		int a = 2;
		int counter = 0;
		int result = 0;

		while (result < 1_000_000) {

			result = (int) Math.pow(a, counter);
			if (result < 1_000_000) {
				System.out.println(result);
			} else {
			}
			counter++;
		}

	}

}
