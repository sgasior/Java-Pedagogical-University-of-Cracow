import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson7 {

	public static void main(String[] args) {
		// ex. 11
		// chceckIfRandomNumberIsBetweenCompartment(5, 155, 25, 100);

		// ex.12
		// printRandomNaturalNumber();

		// ex.13
		// sumNpowK(3, 2);

		// magazine(50000);

		sumOfNumbers();
	}

	// ex. 11
	public static boolean chceckIfRandomNumberIsBetweenCompartment(int rangeMin, int rangeMax, int min, int max) {

		Random random = new Random();

		int number = rangeMin + random.nextInt(rangeMax + 1);
		System.out.println(number);

		if (number <= min || number >= max) {
			System.out.println("Nie nale¿y do przedzia³u");
			return false;
		} else {
			System.out.println("Nale¿y do przedzia³u");
			return true;
		}

	}

	// ex.12

	public static void printRandomNaturalNumber() {
		Random random = new Random();

		int number = 100 + random.nextInt(900);
		System.out.println(number);

		int max = Integer.parseInt((String.valueOf(number)).substring(0, 1));
		for (int i = 1; i < 3; i++) {
			int value = Integer.parseInt((String.valueOf(number)).substring(i, i + 1));
			if (max < value) {
				max = value;
			}

		}
		System.out.println("Najwiêksza cyfra liczby " + number + " to " + max);
	}

	// ex.13

	public static void sumNpowK(int n, int k) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, k);
		}
		System.out.println("Sum= " + sum);
	}

	// ex. 14
	public static void magazine(int numberOfShelves) {
		String[] shelves = new String[50000];
		List<String> wrongNumbers = new ArrayList<String>();

		for (int i = 0; i < shelves.length; i++) {
			if (i + 1 < 10) {
				shelves[i] = "0000" + (i + 1);
				if (shelves[i].contains("2")) {
					wrongNumbers.add(shelves[i]);
				}
			}

			if ((i + 1 >= 10) & (i + 1 < 100)) {
				shelves[i] = "000" + (i + 1);
				if (shelves[i].contains("2")) {
					wrongNumbers.add(shelves[i]);
				}
			}

			if ((i + 1 >= 100) & (i + 1 < 1000)) {
				shelves[i] = "00" + (i + 1);
				if (shelves[i].contains("2")) {
					wrongNumbers.add(shelves[i]);
				}
			}

			if ((i + 1 >= 1000) & (i + 1 < 10000)) {
				shelves[i] = "0" + (i + 1);
				if (shelves[i].contains("2")) {
					wrongNumbers.add(shelves[i]);
				}
			}

			if (i + 1 >= 10000) {
				shelves[i] = "" + (i + 1);
				if (shelves[i].contains("2")) {
					wrongNumbers.add(shelves[i]);
				}
			}

		}

		// for (int i = 0; i < shelves.length; i++) {
		// System.out.println(shelves[i]);
		// }

		for (String string : wrongNumbers) {
			System.out.println(string);
		}

		System.out.println("Size is: " + wrongNumbers.size());
	}

	// ex.15
	public static void sumOfNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		String number = scanner.next();

		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt((String.valueOf(number)).substring(i, i + 1));
		}
		System.out.println(sum);
	}
}
