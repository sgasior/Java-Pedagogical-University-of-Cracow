import java.util.Random;
import java.util.Scanner;

public class Circle {

	private int radius;

	// coordinates of the center of the circle
	private int x;
	private int y;

	// circumference of a circle
	private double circumference;

	// zad.3
	public Circle() {

		System.out.print("Tworzysz obiekt Circle");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj promie�:");
		this.radius = scanner.nextInt();

		System.out.println("Podaj wsp�rzedn� x �rodka okr�gu:");
		this.x = scanner.nextInt();

		System.out.println("Podaj wsp�rzedn� y �rodka okr�gu:");
		this.y = scanner.nextInt();

	}

	public Circle(int radius, int x, int y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// zad.1
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public void moveCircumferenceRandom(int min, int max) {
		this.x += randomRange(min, max);
		this.y += randomRange(min, max);
	}

	public static int randomRange(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public double distanceBetweenCircles(Circle otherCircle) {

		double result = Math.sqrt(Math.pow(Math.abs(this.x - otherCircle.getX()), 2)
				+ Math.pow(Math.abs(this.x - otherCircle.getY()), 2));
		return result;
	}

	public boolean isCirclesInContact(Circle otherCircle) {

		// okr�gi styczne zewnetrznie
		if (distanceBetweenCircles(otherCircle) == radius + otherCircle.getRadius()) {
			return true;
		}

		/// okregi styczne wewnetrznie
		if (distanceBetweenCircles(otherCircle) == Math.abs(radius - otherCircle.getRadius())) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();

		// zad.1
		System.out.println("Obw�d ko�a to: " + circle.getCircumference());

		// zad.2
		System.out.println("�rodek okr�gu przed zmian�: x=" + circle.getX() + " y=" + circle.getY());
		circle.moveCircumferenceRandom(-99, 99);
		System.out.println("�rodek okr�gu po zmianie: x=" + circle.getX() + " y=" + circle.getY());

		// zad.4

		Circle circle2 = new Circle(7, 0, 0);
		Circle circle3 = new Circle(2, 3, 4);
		System.out.println("Odleg�o�� mi�dzy �rodkami okr�g�w: " + circle2 + " oraz drugiego okr�gu " + circle3
				+ " wynosi:" + circle2.distanceBetweenCircles(circle3));

		System.out.println("Okr�gi dotykaj� si� w jednym punkcie: " + circle2.isCirclesInContact(circle3));
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}

}
