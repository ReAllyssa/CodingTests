package main;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 * 
 * Represents a Rectangle
 * 
 */
public class Rectangle implements Shape {

	private double length;
	private double height;
	
	/**
	 * Creates a new Rectangle.
	 *
	 * @param l
	 *            the length of the Rectangle
	 * @param h
	 *            the height of the Rectangle
	 * 
	 * @requires l > 0 && h > 0
	 */
	public Rectangle(double l, double h) {
		this.length = l;
		this.height = h;
	}
	
	/* (non-Javadoc)
	 * @see main.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return length * height;
	}

	/* (non-Javadoc)
	 * @see main.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return 2.0*length + 2.0*height;
	}

}
