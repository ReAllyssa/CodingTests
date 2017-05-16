package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 * 
 * Tests for the Circle class
 *
 */
public class CircleTest {
	private static final double DELTA = 0.01;
	private Circle one;
	private Circle two;
	private Circle lessThanOne;
	private Circle fourThirteen;
	private Circle sixTweleve;

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		one = new Circle(1.0);
		two = new Circle(2.0);
		lessThanOne = new Circle(0.5);
		fourThirteen = new Circle(413.0);
		sixTweleve = new Circle(6.12);
	}

	@Test
	public void testArea() {
		assertEquals(3.14, one.getArea(), DELTA);
		assertEquals(12.57, two.getArea(), DELTA);
		assertEquals(0.79, lessThanOne.getArea(), DELTA);
		assertEquals(535858.32, fourThirteen.getArea(), DELTA);
		assertEquals(117.67, sixTweleve.getArea(), DELTA);
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(6.28, one.getPerimeter(), DELTA);
		assertEquals(12.57, two.getPerimeter(), DELTA);
		assertEquals(3.14, lessThanOne.getPerimeter(), DELTA);
		assertEquals(2594.96, fourThirteen.getPerimeter(), DELTA);
		assertEquals(38.45, sixTweleve.getPerimeter(), DELTA);
	}

}
