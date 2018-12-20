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

	public double Circuit() {
		double distAB = this.coordinateA.distanceBetweenPoints(this.coordinateB);
		double distAC = this.coordinateA.distanceBetweenPoints(this.coordinateC);
		double distBC = this.coordinateB.distanceBetweenPoints(this.coordinateC);
		return distAB + distAC + distBC;
	}

	public double Area() {
		double p = this.Circuit() / 2;
		double distAB = this.coordinateA.distanceBetweenPoints(this.coordinateB);
		double distAC = this.coordinateA.distanceBetweenPoints(this.coordinateC);
		double distBC = this.coordinateB.distanceBetweenPoints(this.coordinateC);
		return Math.sqrt(p * (p - distAB) * (p - distAC) * (p - distBC));

	}

	public static void main(String[] args) {
		// Triangle triangle = new Triangle(new Coordinate(2, 1), new Coordinate(4, 5),
		// new Coordinate(-3, -9));
		Triangle triangle = new Triangle();
		triangle.print();
		System.out.println("Obwód wynosi: " + triangle.Circuit());
		System.out.println("Pole wynosi: " + triangle.Area());
		System.out.println("Czy punkty s¹ wspó³liniowe: "
				+ triangle.getCoordinateA().isCollinear(triangle.getCoordinateB(), triangle.coordinateC));
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
	private int x;
	private int y;

	public Coordinate() {

	}

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

	public double distanceBetweenPoints(Coordinate other) {

		int distInX = Math.abs(this.x - other.getX());
		int distInY = Math.abs(this.y - other.getY());
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