package main;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 * 
 * Represents a Quadrilateral
 *
 */
public class Quadrilateral implements Shape {

	private double[] sides;
	private double angle;
	
	/**
	 * Creates a new quadrilateral.
	 *
	 * @param sides
	 *            the sides of the Quadrilateral
	 * @param a
	 *            the angle between the first two sides in degrees
	 * 
	 * @requires sides.length == 4
	 * 			 sides[i] > 0
	 * 
	 * @requires a > 0
	 */
	public Quadrilateral(double[] sides, double a) {
		this.sides = sides;
		this.angle = Math.toRadians(a);
	}
	
	/* (non-Javadoc)
	 * @see main.Shape#getArea()
	 */
	@Override
	public double getArea() {
		/* Get the area of the triangle made by the first two sides, that angle,
		 * and the diagonal. */
		
		// Find the diagonal using the Law of Cosines
		double a = sides[0];
		double b = sides[1];
		double diag = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) -
							    (2 * a * b * Math.cos(angle)));
		
		// Find the area of the first triangle using Heron's formula
		double s1 = (a + b + diag) / 2;
		double area1 = Math.sqrt(s1*(s1-a)*(s1-b)*(s1-diag));
		
		// Find the area of the second triangle using Heron's formula
		double c = sides[2];
		double d = sides[3];
		double s2 = (c + d + diag) / 2;
		double area2 = Math.sqrt(s2*(s2-c)*(s2-d)*(s2-diag));
		
		// Add them together
		return area1 + area2;
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
