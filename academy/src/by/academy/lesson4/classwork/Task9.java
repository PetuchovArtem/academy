package by.academy.lesson4.classwork;

public class Task9 {

	public static void main(String[] args) {
		// даны натуральные числа от 35 до 87.
//	Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2 или 5.

		for (int i = 35; i <= 87; i++) {
			if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
				System.out.println(i);
			}
		}

	}

}