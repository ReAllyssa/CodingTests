package main;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 * Represents a Square
 * 
 */
public class Square implements Shape {
	
	private double side;
	
	/**
	 * Creates a new Square.
	 *
	 * @param x
	 *            the length of a side of the square
	 * 
	 * @requires x > 0
	 */
	public Square(double x) {
		this.side = x;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	/* (non-Javadoc)
	 * @see main.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return side * side;
	}

	/**
	 * Gets the perimeter.
	 *
	 * @return the perimeter
	 */
	/* (non-Javadoc)
	 * @see main.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return 4.0 * side;
	}

}
