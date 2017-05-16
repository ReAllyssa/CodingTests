package main;

import java.util.Collections;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 */
public class Task3 {

	public static void main(String[] args) {
		/* Code to rewrite :
		 * for (int i = 1; i <= 5; i++) {
		 * 	for (int j = 1; j <= (5 - i); j++) {
		 * 	 System.out.print(".");
		 *  }
		 *  for (int k = 1; k <= i; k++) {
		 *   System.out.print(i);
		 *  }
		 *  System.out.println();
		 * }
		 */

		for (int i=1; i<=5; i++) {
			StringBuilder builder = new StringBuilder();
			builder.append(String.join("", Collections.nCopies(5-i, ".")));
			builder.append(String.join("", Collections.nCopies(i, String.valueOf(i))));
			System.out.println(builder);
		}
		
		/* To rewrite it to work for any n, just replace every instance of 5
		 * with n. */
	
	}
	

}
