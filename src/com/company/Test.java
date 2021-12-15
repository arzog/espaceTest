public class Test {
	final static int[][] GAME_BOARD = new int[5][7];
	final static int NBR_BOMBS = 5;
	final static int[][] BOMB_POS = new int[NBR_BOMBS][2];

	public static void main(String[] args) {
		/*
		 * int[][] myTab = new int[9][5]; int[][] BOMB_POS = new int[5][2]; int x_player
		 * = myTab[0].length / 2; int y_player = myTab.length / 2; int tempBombX = 0;
		 * int tempBombY = 0;
		 * 
		 * for (int i = 0; i < myTab.length; i++) {
		 * 
		 * for (int j = 0; j < myTab[0].length; j++) { do { tempBombX =
		 * Utilities.randomInt(0, myTab[0].length); tempBombY = Utilities.randomInt(0,
		 * myTab.length); } while (tempBombX == x_player && tempBombY == y_player);
		 * 
		 * BOMB_POS[j][1] = tempBombX; BOMB_POS[j][0] = tempBombY; }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < BOMB_POS.length; i++) { for (int j = 1; j <
		 * BOMB_POS[0].length; j++) {
		 * 
		 * System.out.print("(" + BOMB_POS[i][0] + "," + BOMB_POS[i][1] + ") ");
		 * 
		 * } System.out.println(); }
		 * 
		 * System.out.println("Y player : " + y_player + ", X player : " + x_player);
		 * System.out.println(isInTabMultiDimension(x_player, y_player, BOMB_POS));
		 * 
		 * }
		 * 
		 * public static boolean isInTabMultiDimensionV2(int x_player, int y_player, int
		 * BOMB_POS[][]) {
		 * 
		 * int similarY = 0;
		 * 
		 * similarY = Utilities.isInTabV2(y_player, BOMB_POS);
		 * 
		 * if (similarY != -1) { int i = 0; while (i < BOMB_POS[0].length) { if
		 * (x_player == BOMB_POS[similarY][i]) { return true; } i++; } return false;
		 * 
		 * } else { return false; }
		 */

		int x_player = GAME_BOARD[0].length / 2;
		int y_player = GAME_BOARD.length / 2;

		
		showBombsPositions(x_player, y_player, BOMB_POS);
		System.out.println(x_player + "," + y_player);
		letsPlay(x_player, y_player, BOMB_POS);

	}

	public static void showBombsPositions(int x_player, int y_player, int BOMB_POS[][]) {

		setBombsPositions(x_player, y_player, BOMB_POS);
		for (int i = 0; i < BOMB_POS.length; i++) {

			System.out.print("(" + BOMB_POS[i][0] + "," + BOMB_POS[i][1] + ") ");

		}
		System.out.println();

	}

	public static void setBombsPositions(int x_player, int y_player, int[][] BOMB_POS) {

		int tempBombX = 0;
		int tempBombY = 0;

		for (int i = 0; i < BOMB_POS.length; i++) {

			do {
				tempBombX = Utilities.randomInt(0, GAME_BOARD[0].length);
				tempBombY = Utilities.randomInt(0, GAME_BOARD.length);
			} while (tempBombX == x_player && tempBombY == y_player);

			BOMB_POS[i][1] = tempBombX;
			BOMB_POS[i][0] = tempBombY;

		}

	}

	public static void letsPlay(int x_player, int y_player, int BOMB_POS[][]) {

		String playerMove = "";
		int tempX_player = x_player;
		int tempY_player = y_player;

		do {
			playerMove = Utilities.getUserSpecificInput(
					"Position actuelle : (" + tempX_player + "," + tempY_player + ") déplacement RLUD/ ?", "RLUD");

			if (playerMove.equalsIgnoreCase("R")) {
				tempX_player = tempX_player + 1;

			} else if (playerMove.equalsIgnoreCase("L")) {
				tempX_player = tempX_player - 1;

			} else if (playerMove.equalsIgnoreCase("U")) {
				tempY_player = tempY_player + 1;

			} else if (playerMove.equalsIgnoreCase("D")) {
				tempY_player = tempY_player - 1;

			}

		} while ((!isInTabMultiDimension(tempX_player, tempY_player, BOMB_POS)) || tempX_player < 0 );

		if (isInTabMultiDimension(tempX_player, tempY_player, BOMB_POS)) {

			System.out.println("Bombe touchée - Vous avez perdu!");

		} else {

			System.out.println("Félicitations, vous avez gagné !");

		}

	}

	public static boolean isInTabMultiDimension(int x_player, int y_player, int BOMB_POS[][]) {

		int similarY = 0;

		similarY = isInTabV2(y_player, BOMB_POS);

		if (similarY != -1 && x_player == BOMB_POS[similarY][0]) {
			return true;

		} else {
			return false;
		}

	}

	static int isInTabV2(int inputNumber, int Nombres[][]) {
		int i = 0;

		while (i < Nombres.length) {
			if (inputNumber == Nombres[i][1]) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
