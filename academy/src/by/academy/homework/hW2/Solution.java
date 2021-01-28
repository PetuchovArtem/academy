package by.academy.homework.hW2;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;

		for (int n = 0; n < arr.length; n++) {
			int temp = arr[n];
			for (int m = 0; m < arr.length; m++) {
				if (arr[m] - temp == k) {
					pairsCount++;
				}
			}
		}

		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Введите 2 значения: переменную, разницу: ");
		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		System.out.println("Введите массив значений:");

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}

		int result = pairs(k, arr);
		System.out.println(result);
		scanner.close();
	}

}
