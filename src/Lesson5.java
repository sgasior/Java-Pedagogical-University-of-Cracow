import java.util.Iterator;
import java.util.Random;

public class Lesson5 {

	public static void main(String[] args) {
		// zad.6
		// fib(11);

		// zad.7
		// System.out.println(howManyUnluckiesNumbers(13, 4, 1, 99999));

		// zad.8
		// System.out.println("Czy jest liczb¹ pierwsza: " + isPrimaryNumber(13));

		// zad.9
		// randomFloat(-3, 3);
		// System.out.println(randomFloat(-3, 3));

		// zad.10
		System.out.println(floatInt(2, 5));
	}

	// zad.6
	public static void fib(int n) {
		System.out.println("0" + "\n" + "1");
		int first = 0;
		int second = 1;
		for (int i = 0; i <= n; i++) {
			int sum = first + second;
			first = second;
			second = sum;
			System.out.println(sum);

		}
	}

	// zad.7
	public static int howManyUnluckiesNumbers(int unLuckyNumber1, int unLuckyNumber2, int startIndex, int endIndex) {
		int sum = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			if (("" + i).contains("" + unLuckyNumber1) || ("" + i).contains("" + unLuckyNumber2)) {
				sum++;
			}
		}

		return sum;
	}

	// zad.8
	public static boolean isPrimaryNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				if (i != number) {
					return false;
				}
			}
		}
		return true;
	}

	// zad.9
	public static float randomFloat(float min, float max) {

		Random random = new Random();

		float number = min + random.nextFloat() * (Math.abs(max - min));
		if (number == max) {
			number -= random.nextFloat();
		}

		// boolean check = true;
		// while (check) {
		// float number = min + random.nextFloat() * (Math.abs(max - min));
		// if (number == max) {
		// number -= random.nextFloat();
		// }
		// System.out.println(number);
		// if (number == 2.0) {
		// check = false;
		// }
		// ;

		return number;

	}

	// zad.10
	public static float floatInt(int min, int max) {

		Random random = new Random();

		return random.nextInt((max - min) + 1) + min;

	}

}
