package main;


/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 * Represents a Triangle
 * 
 */
public class Triangle implements Shape {
	
	private double[] sides;
	
	/**
	 * Creates a new triangle.
	 *
	 * @param sides
	 *            lengths of the sides of the Triangle
	 *            
	 * @requires sides.length == 3
	 * 			 sides[i] > 0
	 */
	public Triangle(double[] sides) {
		this.sides = sides;
	}
	
	/* (non-Javadoc)
	 * @see main.Shape#getArea()
	 */
	@Override
	public double getArea() {
		// Find area using Heron's formula
		double a = sides[0];
		double b = sides[1];
		double c = sides[2];
		
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	/* (non-Javadoc)
	 * @see main.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		double perimeter = 0;
		for (int i=0; i<sides.length; i++) {
			perimeter += sides[i];
		}
		return perimeter;
	}

}
