import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Lesson8 {

	// zad.7
	public static int counter = 0;

	public static void main(String[] args) {

		// zad.1
		// printTable(createRandomTab(20));

		// zad.2
		// showTables(5, 10);

		// zad.3
		// printTable(sortAscending(new int[] { 1, 4, 2, 3 }));

		// zad.4

		// printTable(sortAscendingStrings(new String[] { "Maria Sk³odowska Curie",
		// "Henryk Sienkiewicz",
		// "W³adys³aw Reymont", "Czes³aw Mi³osz", "Józef Rotbalt", "Lech Wa³êsa",
		// "Wies³awa Szymborska" }));

		// zad.5 i 6
		// howManyFibCanWeCalculate(1);

		// zad.7
		fibonacci(15);
		System.out.println(
				"Przy obliczaniu fib(15) " + " konieczne było obliczenie czwartego elementu: " + counter + " razy");

	}

	// zad.1
	public static int randomRange(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public static int[] createRandomTab(int elements) {
		int[] tab = new int[elements];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randomRange(1, 20);
		}
		return tab;
	}

	public static void printTable(int[] tab) {
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}

	// zad.2
	public static void showTables(int howManyTables, int howManyNumberInTable) {

		for (int i = 1; i <= howManyTables; i++) {
			printTable(createRandomTab(howManyNumberInTable));
			System.out.print("\n");
		}
	}

	// zad.3
	public static int[] sortAscending(int[] tab) {
		Arrays.sort(tab);
		return tab;
	}

	// zad.4
	public static String[] sortAscendingStrings(String[] tab) {
		Arrays.sort(tab);
		return tab;
	}

	public static void printTable(String[] tab) {
		for (String i : tab) {
			System.out.println(i + " ");
		}
	}

	public static long fibonacci(int n) {

		if (n == 4) {
			counter++;
		}

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// zad.6
	// obliczanie fib(50) wynosi 47s natomiast fib(51) juz 77s.
	public static void howManyFibCanWeCalculate(long minutes) {
		long duration = 0;
		int i = 0;
		long result = 0;
		long elementA = 0;
		long elementB = 0;
		do {

			if (i <= 50) {
				long start = System.currentTimeMillis();
				long fib = fibonacci(i);

				if (i == 49) {
					elementA = fib;
				}

				if (i == 50) {
					elementB = fib;
				}
				System.out.println("Liczba fib dla i= " + i + " wynosi: " + fib);
				long end = System.currentTimeMillis();
				duration = end - start;
				System.out.println("Duration= " + duration / 1000 + " sek.");

				i++;

			} else if (i <= 80) {
				System.out.println("else");
				long start = System.currentTimeMillis();
				result = elementA + elementB;
				elementA = elementB;
				elementB = result;
				System.out.println("Liczba fib dla i= " + i + " wynosi: " + result);
				i++;
				long end = System.currentTimeMillis();
				duration = end - start;
				System.out.println("Duration= " + duration / 1000 + " sek.");
			} else {
				break;
			}

		} while (duration <= minutes * 1000 * 60);

	}

}
