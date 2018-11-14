import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson6 {

	public static void main(String[] args) {

		// zad.16
		// multiplyByNumber(5);

		// zad.17
		// showRandomNumbersFromMultipleTable(10);

		// zad.18
		// System.out.println(isPalindrom("Tee t"));

		// zad.19
		drawDiamond();
	}

	// zad.16
	public static void multiplyByNumber(int number) {

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		int[] multipliedByNumber = numbers.clone();
		for (int i : multipliedByNumber) {
			i *= number;
			System.out.println(i);
		}
	}

	// zad.17
	public static void showRandomNumbersFromMultipleTable(int howManyNumbers) {

		List<Integer> list = new ArrayList<>();

		for (int i = 2; i <= 9; i++) {
			int j = i;
			while (j != 10) {
				list.add(i * j);
				// System.out.println("i= " + i + " j= " + j + " multiplied: " + i * j);
				j++;
			}

		}

		List<Integer> randomIndexes = new ArrayList<>();
		for (int i = 0; i < howManyNumbers; i++) {
			boolean notAdded = true;
			while (notAdded) {
				int randomIndex = randomInt(0, list.size() - 1);
				if (randomIndexes.contains(randomIndex)) {
					notAdded = true;
				} else {
					randomIndexes.add(randomIndex);
					notAdded = false;
				}
			}

		}

		List<Integer> results = new ArrayList<>();
		for (Integer index : randomIndexes) {
			results.add(list.get(index));
		}

		for (Integer result : results) {
			System.out.print(result + " ");
		}

	}

	public static int randomInt(int min, int max) {

		Random random = new Random();

		return random.nextInt((max - min) + 1) + min;

	}

	// zad.18
	public static boolean isPalindrom(String text) {

		boolean result = true;
		String[] formatedText = formatText(text);

		for (int i = 0; i < formatedText.length; i++) {
			int howManyCharsToCheck = 0;
			int counter = 0;
			howManyCharsToCheck = formatedText[i].length() / 2;
			for (int j = 0; j < howManyCharsToCheck; j++) {
				if (formatedText[i].charAt(j) == formatedText[i].charAt(formatedText[i].length() - 1 - j)) {
					counter++;
				}
			}
			if (howManyCharsToCheck != counter) {
				return false;
			}

		}
		return result;
	}

	public static String[] formatText(String text) {
		String formatedText = text.replace('(', ' ').replace(')', ' ').replace('!', ' ').replace('?', ' ')
				.replace('.', ' ').replaceAll(" ", "").replaceAll(",", "").replaceAll("-", "").replaceAll("\"", "")
				.toLowerCase();
		return formatedText.split("\n");
	}

	public static void drawDiamond() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Wybierz symbol");
		System.out.println("Wybierz symbol " + "\n * - kliknij 1 " + "\n # - kliknij 2 " + "\n + - kliknij 3");

		int numberSelected = scanner.nextInt();

		String symbol;
		StringBuilder stringBuilder = new StringBuilder();
		switch (numberSelected) {
		case 1:
			symbol = "*";
			break;
		case 2:
			symbol = "#";
			break;
		case 3:
			symbol = "+";
			break;
		default:
			symbol = "";
			break;
		}

		stringBuilder.append("     " + symbol + " " + symbol + " " + symbol + " " + symbol + " " + symbol)
				.append("\n    " + symbol + "       " + symbol).append("\n   " + symbol + "       " + symbol)
				.append("\n  " + symbol + "       " + symbol)
				.append("\n " + symbol + " " + symbol + " " + symbol + " " + symbol + " " + symbol);
		System.out.println(stringBuilder);
	}
}
