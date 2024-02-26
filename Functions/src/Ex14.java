import java.util.Random;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int chosenLevel;
		menuForSecretPasswordPlay();
		chosenLevel = scanner.nextInt();

		switch (chosenLevel) {
			case 1:
				playGame(20);
				break;
			case 2:
				playGame(15);
				break;
			case 3:
				playGame(10);
				break;
			case 4:
				int randomChances = new Random().nextInt(21) + 5;
				playGame(randomChances);
				break;
			default:
				System.out.println("Invalid choice. Exiting...");
		}
	}
	public static void playGame(int chances) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int[] secretCode = generateSecretCode();

		while (chances > 0) {
			int[] guess = getValidGuess(scanner, chances);
			int[] feedback = evaluateGuess(secretCode, guess);
			printFeedback(feedback);
			chances--;

			if (feedback[0] == 4) {
				System.out.println("Congratulations! You've guessed the secret code!");
				return;
			} else {
				System.out.println("Chances left: " + chances);
			}

			if (chances == 0) {
				System.out.println("Game over. The secret code was: ");
				printSecretCode(secretCode);
				return;
			}

		}
	}

	public static int[] generateSecretCode() {
		Random random = new Random();
		int[] secretCode = new int[4];
		boolean valid = false;

		while (!valid) {
			for (int i = 0; i < 4; i++) {
				secretCode[i] = random.nextInt(6) + 1;
			}

			valid = isValidCode(secretCode);
		}

		return secretCode;
	}

	public static boolean isValidCode(int[] code) {
		for (int i = 0; i < code.length; i++) {
			for (int j = i + 1; j < code.length; j++) {
				if (code[i] == code[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[] getValidGuess(Scanner scanner, int chances) {
		int[] guess = new int[4];
		boolean validGuess = false;

		while (!validGuess) {
			System.out.println("Enter your guess (4 digits between 1 and 6): ");
			String input = scanner.next();

			if (input.length() != 4) {
				System.out.println("Invalid guess. Please enter 4 digits.");
				continue;
			}

			boolean validDigits = true;
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c < '1' || c > '6') {
					validDigits = false;
					break;
				}
				guess[i] = Character.getNumericValue(c);
			}

			if (!validDigits) {
				System.out.println("Invalid guess. Digits must be between 1 and 6.");
				continue;
			}

			if (!isValidCode(guess)) {
				System.out.println("Invalid guess. Digits must be unique.");
				chances -= 2;
				System.out.println("You've lost 2 chances for entering duplicate digits.");
				System.out.println("Chances left: " + chances);
				if (chances <= 0) {
					System.out.println("You've used all your chances. Game over.");
					return null;
				}
				continue;
			}

			validGuess = true;
		}

		return guess;
	}

	public static int[] evaluateGuess(int[] secretCode, int[] guess) {
		int[] feedback = new int[2];

		for (int i = 0; i < secretCode.length; i++) {
			if (secretCode[i] == guess[i]) {
				feedback[0]++;
			} else {
				for (int j = 0; j < secretCode.length; j++) {
					if (secretCode[j] == guess[i]) {
						feedback[1]++;
						break;
					}
				}
			}
		}

		return feedback;
	}

	public static void printFeedback(int[] feedback) {
		System.out.println("Exact matches: " + feedback[0]);
		System.out.println("Partial matches: " + feedback[1]);
	}

	public static void menuForSecretPasswordPlay() {
		System.out.println("|Welcome to the game guess the secret code|\n" +
				"|You have to guess 4 digits from 1 to 6|");
		System.out.println("""
                Choose the course of action from the following:
                1. Easy track: 20 opportunities
                2. Medium route: 15 opportunities
                3. Difficult course: 10 opportunities
                4. Surprising route: the number of opportunities is drawn between the values 5-25""");
	}

	public static void printSecretCode(int[] code) {
		for (int digit : code) {
			System.out.print(digit);
		}
		System.out.println();
	}
}