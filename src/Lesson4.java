import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lesson4 {
	public static void main(String[] arg) {
		// ex.1
		// returnOddNumber(1, 99);

		// ex.2
		// System.out.println("Min abs is " + findMinABS(-2, 4, 5));

		// ex. 5
		// System.out.println("Silnia " + silnia(8));
		// System.out.println("Silnia rekurencyjnie " + recursionSilnia(8));

		// ex. 3
		// howManyTimeSymetricTime();

		// ex. 4
		// checkTheSeason();

	}

	// ex.1
	public static Integer[] returnOddNumber(int startNumber, int endNumber) {

		List<Integer> myList = new ArrayList<>();

		for (int i = startNumber; i < endNumber; i++) {
			if (i % 2 != 0) {
				myList.add(i);
			}
		}

		// for (Integer integer : myList) {
		// System.out.println(integer);
		// }

		// toArray copies content into other array
		Integer tab[] = new Integer[myList.size()];
		tab = myList.toArray(tab);

		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i]);
		}

		System.out.println("\nOdwrotnoœæ kolejna \n");

		System.out.println(tab[tab.length - 1]);
		for (int i = tab.length - 1; i >= 0; i--) {
			System.out.println(tab[i]);
		}

		return tab;

	}

	// ex.2
	public static double findMinABS(double a, double b, double c) {

		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);

		double min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}

		return min;

	}

	// ex.3
	public static void howManyTimeSymetricTime() {

		String[] hoursPerDay = new String[24];
		for (int i = 0; i < hoursPerDay.length; i++) {
			if (i - 10 < 0) {
				hoursPerDay[i] = "0" + i;
			} else {
				hoursPerDay[i] = "" + i;
			}
		}

		for (int i = 0; i < hoursPerDay.length; i++) {
			System.out.println(hoursPerDay[i]);
		}

		String[] minutesPerHouer = new String[60];
		for (int i = 0; i < minutesPerHouer.length; i++) {
			if (i - 10 < 0) {
				minutesPerHouer[i] = "0" + i;
			} else {
				minutesPerHouer[i] = "" + i;
			}
		}
		for (int i = 0; i < minutesPerHouer.length; i++) {
			System.out.println(minutesPerHouer[i]);
		}

		List<String> simetricTime = new ArrayList<>();
		for (int i = 0; i < hoursPerDay.length; i++) {
			for (int j = 0; j < minutesPerHouer.length; j++) {
				if ((hoursPerDay[i].substring(1)).equals(minutesPerHouer[j].substring(0, 1))
						&& (hoursPerDay[i].substring(0, 1)).equals(minutesPerHouer[j].substring(1))

				) {
					simetricTime.add(hoursPerDay[i] + ":" + minutesPerHouer[j]);
				}
			}
		}

		for (String string : simetricTime) {
			System.out.println(string);
		}
		System.out.println("Liczba godzin otrzymanych:" + simetricTime.size());

	}

	// ex.4
	public static void checkTheSeason() {

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Podaj numer miesi¹ca");
			Integer number = scanner.nextInt();
			switch (number) {
			case 1:
				System.out.println(Season.ZIMA);
				break;
			case 2:
				System.out.println(Season.ZIMA);
				break;
			case 3:
				System.out.println(Season.WIOSNA);
				break;
			case 4:
				System.out.println(Season.WIOSNA);
				break;
			case 5:
				System.out.println(Season.WIOSNA);
				break;
			case 6:
				System.out.println(Season.LATO);
				break;
			case 7:
				System.out.println(Season.LATO);
				break;
			case 8:
				System.out.println(Season.LATO);
				break;
			case 9:
				System.out.println(Season.JESIEÑ);
				break;
			case 10:
				System.out.println(Season.JESIEÑ);
				break;
			case 11:
				System.out.println(Season.JESIEÑ);
				break;
			case 12:
				System.out.println(Season.ZIMA);
				break;
			default:
				System.out.println("Nie prawdi³owy numer");
				break;
			}
		} catch (InputMismatchException e) {

			System.out.println("Podano z³¹ liczbê");
		}

	}

	// ex.5
	public static int silnia(int n) {

		int result = 1;

		if (n == 0) {
			return 1;
		}

		for (int i = 2; i <= n; i++) {
			result = result * i;
		}

		return result;
	}

	public static int recursionSilnia(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recursionSilnia(n - 1);
		}

	}
}

enum Season {
	ZIMA, WIOSNA, LATO, JESIEÑ;
}
