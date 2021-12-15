package com.company;

import java.util.Random;

public class Exo_tombola {

	public static void exo_tomb () {

		int[] tickets = new int[10];

		randomTickets(tickets);

		for (int i = 0; i < tickets.length; i++) {

			System.out.println("Num du lot " + (i + 1) + " Numero de billet " + tickets[i]);

		}

	}

	static void randomTickets(int tickets[]) {
		int temp = 0;
		boolean isInTab = false;
		for (int i = 0; i < tickets.length; i++) {

			do {
				temp = randomInt(1, 5);
				isInTab = isInTab(temp, tickets);

				if (isInTab) {
					System.out.println(
							"Num de billet " + temp + " attribue au lot Num " + (i + 1) + "- numero de billet rejete");
				}
			} while (isInTab);

			tickets[i] = temp;
			System.out.println(
					"Num de billet " + tickets[i] + " attribue au lot Num " + (i + 1) + " - numero de billet accepte");

		}

	}

	static boolean isInTab(int inputNumber, int Nombres[]) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i]) {
				return true;
			}
			i++;
		}
		return false;

	}

	public static int randomInt(int min, int max) {
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}// en randInt

}