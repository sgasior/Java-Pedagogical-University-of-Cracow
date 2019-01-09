import java.util.Scanner;

public class Triangle {

	private Coordinate coordinateA;
	private Coordinate coordinateB;
	private Coordinate coordinateC;

	public Triangle() {

		System.out.print("Tworzysz obiekt Triangle\n");
		Scanner scanner = new Scanner(System.in);

		coordinateA = new Coordinate();
		coordinateB = new Coordinate();
		coordinateC = new Coordinate();

		System.out.println("Podaj wspó³rzêdn¹ X punktu A");
		coordinateA.setX(scanner.nextInt());

		System.out.println("Podaj wspó³rzêdn¹ Y punktu A");
		coordinateA.setY(scanner.nextInt());

		System.out.println("Podaj wspó³rzêdn¹ X punktu B");
		coordinateB.setX(scanner.nextInt());

		System.out.println("Podaj wspó³rzêdn¹ Y punktu B");
		coordinateB.setY(scanner.nextInt());

		System.out.println("Podaj wspó³rzêdn¹ X punktu C");
		coordinateC.setX(scanner.nextInt());

		System.out.println("Podaj wspó³rzêdn¹ Y punktu C");
		coordinateC.setY(scanner.nextInt());

		scanner.close();

	}

	public Triangle(Coordinate coordinateA, Coordinate coordinateB, Coordinate coordinateC) {
		this.coordinateA = coordinateA;
		this.coordinateB = coordinateB;
		this.coordinateC = coordinateC;
	}

	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Triangle [coordinateA=" + coordinateA + ", coordinateB=" + coordinateB + ", coordinateC=" + coordinateC
				+ "]";
	}

	public double circuit() {
		double distAB = this.coordinateA.distanceBetweenPoints(this.coordinateB);
		double distAC = this.coordinateA.distanceBetweenPoints(this.coordinateC);
		double distBC = this.coordinateB.distanceBetweenPoints(this.coordinateC);
		return distAB + distAC + distBC;
	}

	public double area() {
		double p = this.circuit() / 2;
		double distAB = this.coordinateA.distanceBetweenPoints(this.coordinateB);
		double distAC = this.coordinateA.distanceBetweenPoints(this.coordinateC);
		double distBC = this.coordinateB.distanceBetweenPoints(this.coordinateC);
		return Math.sqrt(p * (p - distAB) * (p - distAC) * (p - distBC));

	}

	public Coordinate centerGravity() {

		double Qx = (coordinateA.getX() + coordinateB.getX() + coordinateC.getX()) / 3;
		double Qy = (coordinateA.getY() + coordinateB.getY() + coordinateC.getY()) / 3;
		return new Coordinate(Qx, Qy);

	}

	public void rotateTriangle(Coordinate aroundCoordinate, double angle) {

		double degreestoRadiansConts = 0.01745329;

		if (aroundCoordinate == coordinateA) {
			coordinateB.setX(((coordinateB.getX() * Math.cos(angle * degreestoRadiansConts)
					- coordinateB.getY() * Math.sin((angle * degreestoRadiansConts)))));

			coordinateB.setY(((coordinateB.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateB.getY() * Math.cos((angle * degreestoRadiansConts))));

			coordinateC.setX(((coordinateC.getX() * Math.cos(angle * degreestoRadiansConts))
					- coordinateC.getY() * Math.sin((angle * degreestoRadiansConts))));

			coordinateC.setY(((coordinateC.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateC.getY() * Math.cos((angle * degreestoRadiansConts))));

		} else if (aroundCoordinate == coordinateB) {
			coordinateA.setX(((coordinateA.getX() * Math.cos(angle * degreestoRadiansConts))
					- coordinateA.getY() * Math.sin((angle * degreestoRadiansConts))));

			coordinateA.setY(((coordinateA.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateA.getY() * Math.cos((angle * degreestoRadiansConts))));

			coordinateC.setX(((coordinateC.getX() * Math.cos(angle * degreestoRadiansConts))
					- coordinateC.getY() * Math.sin((angle * degreestoRadiansConts))));

			coordinateC.setY(((coordinateC.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateC.getY() * Math.cos((angle * degreestoRadiansConts))));

		} else {

			coordinateA.setX(((coordinateA.getX() * Math.cos(angle * degreestoRadiansConts))
					- coordinateA.getY() * Math.sin((angle * degreestoRadiansConts))));

			coordinateA.setY(((coordinateA.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateA.getY() * Math.cos((angle * degreestoRadiansConts))));

			coordinateB.setX(((coordinateB.getX() * Math.cos(angle * degreestoRadiansConts))
					- coordinateB.getY() * Math.sin((angle * degreestoRadiansConts))));

			coordinateB.setY(((coordinateB.getX() * Math.sin(angle * degreestoRadiansConts))
					+ coordinateB.getY() * Math.cos((angle * degreestoRadiansConts))));
		}

	}

	private void rotate(Coordinate coordinate) {

	}

	public static void main(String[] args) {
		// Triangle triangle = new Triangle(new Coordinate(2, 1), new Coordinate(4, 5),
		// new Coordinate(-3, -9));
		Triangle triangle = new Triangle(new Coordinate(1, -3), new Coordinate(2, 8), new Coordinate(-6, 4));
		triangle.print();
		System.out.println("Obwód wynosi: " + triangle.circuit());
		System.out.println("Pole wynosi: " + triangle.area());
		System.out.println("Czy punkty s¹ wspó³liniowe: "
				+ triangle.getCoordinateA().isCollinear(triangle.getCoordinateB(), triangle.coordinateC));
		System.out.println("Œrodek masy trójk¹ta to " + triangle.centerGravity());

		System.out.println("Obrót o 360 stopni:");
		triangle.rotateTriangle(triangle.getCoordinateB(), 360);
		triangle.print();
	}

	public Coordinate getCoordinateA() {
		return coordinateA;
	}

	public void setCoordinateA(Coordinate coordinateA) {
		this.coordinateA = coordinateA;
	}

	public Coordinate getCoordinateB() {
		return coordinateB;
	}

	public void setCoordinateB(Coordinate coordinateB) {
		this.coordinateB = coordinateB;
	}

	public Coordinate getCoordinateC() {
		return coordinateC;
	}

	public void setCoordinateC(Coordinate coordinateC) {
		this.coordinateC = coordinateC;
	}

}

class Coordinate {
	private double x;
	private double y;

	public Coordinate() {

	}

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double d) {
		this.x = d;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distanceBetweenPoints(Coordinate other) {

		double distInX = Math.abs(this.x - other.getX());
		double distInY = Math.abs(this.y - other.getY());
		return Math.sqrt(Math.pow(distInX, 2) + Math.pow(distInY, 2));
	}

	public boolean isCollinear(Coordinate other, Coordinate other2) {

		double a1 = (other.getY() - this.y) / (other.getX() - this.x);
		double a2 = (other2.getY() - this.y) / (other2.getX() - this.x);
		return a1 == a2;

	}

	public static boolean isCollinear(Coordinate o, Coordinate other, Coordinate other2) {

		double a1 = (other.getY() - o.getY()) / (other.getX() - o.getX());
		double a2 = (other2.getY() - o.getY()) / (other2.getX() - o.getX());
		return a1 == a2;

	}

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}

}