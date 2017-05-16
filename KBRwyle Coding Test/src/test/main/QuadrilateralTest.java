package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 */
public class QuadrilateralTest {
	private static final double DELTA = 0.01;
	private Quadrilateral regSmall;
	private Quadrilateral regMed;
	private Quadrilateral regBig;
	private Quadrilateral irregSmall;
	private Quadrilateral irregMed;
	private Quadrilateral irregBig;

	@Before
	public void setUp() {
		regSmall = new Quadrilateral(new double[]{1.0,2.0,1.0,2.0}, 45.0);
		regMed = new Quadrilateral(new double[]{25.0,10.0,25.0,10.0}, 20.0);
		regBig = new Quadrilateral(new double[]{413.0,612.0,413.0,612.0}, 60.0);
		irregSmall = new Quadrilateral(new double[]{1.0,2.0,3.0,4.0}, 43.0);
		irregMed = new Quadrilateral(new double[]{25.0,35.0,39.0,52.0}, 25.0);
		irregBig = new Quadrilateral(new double[]{413.0,612.0,1025.0,1111.0}, 66.0);
	}

	@Test
	public void testArea() {
		assertEquals(1.4142, regSmall.getArea(), DELTA);
		assertEquals(85.5050, regMed.getArea(), DELTA);
		assertEquals(218893.1170, regBig.getArea(), DELTA);
		assertEquals(2.4573, irregSmall.getArea(), DELTA);
		assertEquals(403.0280, irregMed.getArea(), DELTA);
		assertEquals(411518.3990, irregBig.getArea(), DELTA);
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(6.0, regSmall.getPerimeter(), DELTA);
		assertEquals(70.0, regMed.getPerimeter(), DELTA);
		assertEquals(2050.0, regBig.getPerimeter(), DELTA);
		assertEquals(10.0, irregSmall.getPerimeter(), DELTA);
		assertEquals(151.0, irregMed.getPerimeter(), DELTA);
		assertEquals(3161.0, irregBig.getPerimeter(), DELTA);
	}

}
