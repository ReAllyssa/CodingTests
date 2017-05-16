package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 * 
 * Tests for the Triangle class
 *
 */
public class TriangleTest {
	private static final double DELTA = 0.01;
	private Triangle eqLength1;
	private Triangle eqLength13;
	private Triangle eqLength413;
	private Triangle eqLength612;
	private Triangle irregSmall;
	private Triangle irregMed1;
	private Triangle irregMed2;
	private Triangle irregBig;
	
	@Before
	public void setUp() {
		eqLength1 = new Triangle(new double[]{1.0,1.0,1.0});
		eqLength13 = new Triangle(new double[]{13.0,13.0,13.0});
		eqLength413 = new Triangle(new double[]{413.0,413.0,413.0});
		eqLength612 = new Triangle(new double[]{6.12,6.12,6.12});
		irregSmall = new Triangle(new double[]{4,7.1,7.2});
		irregMed1 = new Triangle(new double[]{16.3,21.8,32.4});
		irregMed2 = new Triangle(new double[]{34.0,40.0,55.0});
		irregBig = new Triangle(new double[]{413,612,1000.62});
		
	}
	@Test
	public void equilateralArea() {
		assertEquals(0.43, eqLength1.getArea(), DELTA);
		assertEquals(73.18, eqLength13.getArea(), DELTA);
		assertEquals(73858.54, eqLength413.getArea(), DELTA);
		assertEquals(16.22, eqLength612.getArea(), DELTA);
	}
	
	@Test
	public void equilateralPerimeter() {
		assertEquals(3.0, eqLength1.getPerimeter(), DELTA);
		assertEquals(39.0, eqLength13.getPerimeter(), DELTA);
		assertEquals(1239.0, eqLength413.getPerimeter(), DELTA);
		assertEquals(18.36, eqLength612.getPerimeter(), DELTA);
	}
	
	@Test
	public void irregularArea() {
		assertEquals(13.72, irregSmall.getArea(), DELTA);
		assertEquals(160.02, irregMed1.getArea(), DELTA);
		assertEquals(676.67, irregMed2.getArea(), DELTA);
		assertEquals(54480.61, irregBig.getArea(),DELTA);
	}
	
	@Test
	public void irregularPerimeter() {
		assertEquals(18.3, irregSmall.getPerimeter(), DELTA);
		assertEquals(70.5, irregMed1.getPerimeter(), DELTA);
		assertEquals(129.0, irregMed2.getPerimeter(), DELTA);
		assertEquals(2025.62, irregBig.getPerimeter(), DELTA);
	}

}
