package by.academy.homework.hW2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Deal {

	public static void main(String[] args) {

		int temp = 5;

		Scanner console = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Введите количество игроков, минимум один, максимум 10 ");
		int players = console.nextInt();

		if (players < 2 || players > 10) {
			while (players < 2 || players > 10) {
				System.out.println("Введите количество игроков, минимум один, максимум 10 ");
				players = console.nextInt();
			}
		}

		String[] card = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };
		String[] mast = { "Чирва", "Пика", "Буби", "Крести" };

		String[] playerCard = new String[card.length * mast.length];

		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < mast.length; j++) {
				playerCard[mast.length * i + j] = card[i] + " " + mast[j];
			}
		}

//		System.out.println(Arrays.toString(playerCard));

		for (int m = 0; m < players; m++) {
			System.out.println("Карты игрока " + (m + 1) + " :");
			String temp1 = "test";

			for (int k = 0; k < temp; k++) {
				int r = 1 + random.nextInt(51);
				temp1 = playerCard[r];

				if (temp1 == null) {
					while (temp1 != null) {
						r = 1 + random.nextInt(52);
						temp1 = playerCard[r];
						playerCard[r] = null;
					}
				}
				System.out.println(temp1 + " ");
			}
		}
		console.close();
	}
}
