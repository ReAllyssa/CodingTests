package main;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 * 
 * Represents a Circle
 * 
 */
public class Circle implements Shape {
	public double radius;
	
	/**
	 * Creates a new Circle.
	 *
	 * @param radius
	 *            the radius of the circle
	 * 
	 * @requires r > 0;
	 */
	public Circle(double r) {
		this.radius = r;
	}
	
	/* (non-Javadoc)
	 * @see main.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

	/* (non-Javadoc)
	 * @see main.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return Math.PI * 2.0 * radius;
	}

}
