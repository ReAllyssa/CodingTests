package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 * Tests for the Rectangle class
 * 
 */
public class RectangleTest {
	private static final double DELTA = 0.01;
	private Rectangle oneTwo;
	private Rectangle twoThree;
	private Rectangle halfThird;
	private Rectangle fourThirteen;
	private Rectangle big;

	@Before
	public void setUp() {
		oneTwo = new Rectangle(1.0,2.0);
		twoThree = new Rectangle(2.0,3.0);
		halfThird = new Rectangle(0.5,0.33);
		fourThirteen = new Rectangle(4.0,13.0);
		big = new Rectangle(612.0,1025.0);
	}

	@Test
	public void testArea() {
		assertEquals(2.0, oneTwo.getArea(), DELTA);
		assertEquals(6.0, twoThree.getArea(), DELTA);
		assertEquals(0.165, halfThird.getArea(), DELTA);
		assertEquals(52.0, fourThirteen.getArea(), DELTA);
		assertEquals(627300.0, big.getArea(), DELTA);
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(6.0, oneTwo.getPerimeter(), DELTA);
		assertEquals(10.0, twoThree.getPerimeter(), DELTA);
		assertEquals(1.66, halfThird.getPerimeter(), DELTA);
		assertEquals(34.0, fourThirteen.getPerimeter(), DELTA);
		assertEquals(3274.0, big.getPerimeter(), DELTA);
	}

}
