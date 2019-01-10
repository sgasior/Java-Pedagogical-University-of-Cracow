import java.util.InputMismatchException;
import java.util.Scanner;

public class Point {

	private int x;
	private int y;

	public Point() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Type in x:");
			this.x = scanner.nextInt();
			System.out.println("Type in y:");
			this.y = scanner.nextInt();

			scanner.close();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

	public Point(int x, int y) {
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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public String whichQuarter() {
		if (this.getX() > 0 && this.getY() > 0) {
			return "" + this + " belongs to: quarter 2";
		} else if (this.getX() > 0 && this.getY() < 0) {
			return "" + this + " belongs to: quarter 4";
		} else if (this.getX() < 0 && this.getY() > 0) {
			return "" + this + " belongs to: quarter 1";
		} else if (this.getX() == 0 && this.getY() == 0) {
			return "[0,0]";
		} else {
			return "" + this + " belongs to: quarter 3";
		}
	}

	public boolean isCollinear(Point other, Point other2) {

		double a1 = (other.getY() - this.y) / (other.getX() - this.x);
		double a2 = (other2.getY() - this.y) / (other2.getX() - this.x);
		return a1 == a2;

	}

	public static boolean isCollinear(Point o, Point other, Point other2) {

		double a1 = (other.getY() - o.getY()) / (other.getX() - o.getX());
		double a2 = (other2.getY() - o.getY()) / (other2.getX() - o.getX());
		return a1 == a2;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Point point = new Point(1, 1);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(3, 3);
		System.out.println(point.whichQuarter());

		System.out.println("Czy s¹ wspó³liniowe: " + Point.isCollinear(point, point2, point3));

	}

}
