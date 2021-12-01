import java.util.Random;

public class Exo_tombola {

	public static void main(String[] args) {

		int[] tickets = new int[10];

		randomTickets(tickets);

		for (int i = 0; i < tickets.length; i++) {

			System.out.println("N° du lot " + (i + 1) + " Numéro de billet " + tickets[i]);

		}

	}

	static void randomTickets(int tickets[]) {
		int temp = 0;
		for (int i = 0; i < tickets.length; i++) {

			do {
				temp = randomInt(1, 15);
				if (isInTab(temp, tickets)) {
					System.out.println(
							"N° de billet " + temp + " attribué au lot N° " + (i + 1) + " – numéro de billet rejeté");
				}
			} while (isInTab(temp, tickets));
			tickets[i] = temp;
			System.out.println(
					"N° de billet " + tickets[i] + " attribué au lot N° " + (i + 1) + " – numéro de billet accepté");

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