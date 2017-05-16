package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mari Mercado (mmercado)
 *
 */
public class SquareTest {
	private static final double DELTA = 0.01;
	private Square one;
	private Square two;
	private Square half;
	private Square fourThirteen;
	private Square sixTweleve;

	@Before
	public void setUp() {
		one = new Square(1.0);
		two = new Square(2.0);
		half = new Square(0.5);
		fourThirteen = new Square(413.0);
		sixTweleve = new Square(6.12);
	}

	@Test
	public void testArea() {
		assertEquals(1.0, one.getArea(), DELTA);
		assertEquals(4.0, two.getArea(), DELTA);
		assertEquals(0.25, half.getArea(), DELTA);
		assertEquals(170569.0, fourThirteen.getArea(), DELTA);
		assertEquals(37.4544, sixTweleve.getArea(), DELTA);
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(4.0, one.getPerimeter(), DELTA);
		assertEquals(8.0, two.getPerimeter(), DELTA);
		assertEquals(2.0, half.getPerimeter(), DELTA);
		assertEquals(1652.0, fourThirteen.getPerimeter(), DELTA);
		assertEquals(24.48, sixTweleve.getPerimeter(), DELTA);
	}

}
