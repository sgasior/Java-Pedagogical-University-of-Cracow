import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	public void testWhichQuarter() {

		Point point1 = new Point(1, 1);
		Point point2 = new Point(-1, 1);
		Point point3 = new Point(1, -1);
		Point point4 = new Point(-1, -1);
		Point point5 = new Point(0, 0);

		String validResult1 = "" + point1 + " belongs to: quarter 2";
		String validResult2 = "" + point2 + " belongs to: quarter 1";
		String validResult3 = "" + point3 + " belongs to: quarter 4";
		String validResult4 = "" + point4 + " belongs to: quarter 3";
		String validResult5 = "[0,0]";

		assertEquals(point1.whichQuarter(), validResult1);
		assertEquals(point2.whichQuarter(), validResult2);
		assertEquals(point3.whichQuarter(), validResult3);
		assertEquals(point4.whichQuarter(), validResult4);
		assertEquals(point5.whichQuarter(), validResult5);
	}

	@Test
	public void isCollinearUsingStaticMethod() {

		Point point1 = new Point(1, 1);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(3, 3);

		assertTrue(Point.isCollinear(point1, point2, point3));

	}

	@Test
	public void isCollinearUsingNonStaticMethod() {

		Point point1 = new Point(1, 1);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(3, 3);
		assertTrue(point1.isCollinear(point2, point3));
	}

	@Test
	public void twoOtherObjectsAreNotEqual() {

		Point point1 = new Point(1, 1);
		Point point2 = new Point(2, 2);

		assertNotEquals(point1, point2);

	}

	@Test
	public void twoSameObjectsAreEqual() {
		Point point1 = new Point(1, 1);
		Point point2 = point1;

		assertTrue(point1 == point2);
	}

	@Test
	public void twoObjectsWithSameValuesAreNotEqual() {
		Point point1 = new Point(1, 1);
		Point point2 = new Point(2, 2);

		assertFalse(point1 == point2);
	}

}
