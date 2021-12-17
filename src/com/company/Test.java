import java.util.ArrayList;

public class Test {
	final static int[][] GAME_BOARD = new int[5][7];
	final static int NBR_BOMBS = 3;
	final static ArrayList<int[]> BOMB_POS = new ArrayList<int[]>();

	public static void main(String[] args) {

		int x_player = GAME_BOARD[0].length / 2;
		int y_player = GAME_BOARD.length / 2;

		System.out.println(GAME_BOARD.length);
		setBombsPositions(x_player, y_player, BOMB_POS);
		showBombsPositions(x_player, y_player, BOMB_POS);
		letsPlay(x_player, y_player, BOMB_POS);

	}

	public static void setBombsPositions(int x_player, int y_player, ArrayList<int[]> BOMB_POS) {

		int tempBombX = 0;
		int tempBombY = 0;
		boolean isAlreadyExisting = false;
		boolean isSamePositionPlayer = false;
		boolean validation = false;

		for (int i = 0; i < NBR_BOMBS; i++) {

			do {
				tempBombX = Utilities.randomInt(0, GAME_BOARD[0].length - 1);
				tempBombY = Utilities.randomInt(0, GAME_BOARD.length - 1);
				isSamePositionPlayer = (tempBombX == x_player && tempBombY == y_player) ? true : false;
				isAlreadyExisting = isInTab(tempBombX, tempBombY, BOMB_POS);

				if (isSamePositionPlayer) {
					validation = true;
				} else {
					if (isAlreadyExisting) {
						validation = true;
					} else {
						validation = false;
					}
				}
			} while (validation);

			int bombPos[] = { tempBombY, tempBombX };

			BOMB_POS.add(bombPos);

		}

	}

	public static void showBombsPositions(int x_player, int y_player, ArrayList<int[]> BOMB_POS) {

		for (int i = 0; i < NBR_BOMBS; i++) {

			System.out.print("(" + BOMB_POS.get(i)[1] + "," + BOMB_POS.get(i)[0] + ") ");

		}

		System.out.println();

	}

	public static void letsPlay(int x_player, int y_player, ArrayList<int[]> BOMB_POS) {

		String playerMove = "";
		int tempX_player = x_player;
		int tempY_player = y_player;
		boolean validation = false;

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

			if (isInTab(tempX_player, tempY_player, BOMB_POS)) {
				validation = false;
			} else {
				if (tempX_player <= 0 || tempY_player <= 0 || tempX_player >= GAME_BOARD[0].length
						|| tempY_player >= GAME_BOARD.length) {
					validation = false;
				} else {
					validation = true;
				}
			}

		} while (validation);
		if (isInTab(tempX_player, tempY_player, BOMB_POS)) {

			System.out.println("Bombe touchée - Vous avez perdu!");

		} else {

			System.out.println("Félicitations, vous avez gagné !");

		}

	}

	public static boolean isInTab(int x_player, int y_player, ArrayList<int[]> BOMB_POS) {

		for (int i = 0; i < BOMB_POS.size(); i++) {
			if (y_player == BOMB_POS.get(i)[0]) {
				if (x_player == BOMB_POS.get(i)[1]) {
					return true;
				}
			}

		}
		return false;

	}

}
