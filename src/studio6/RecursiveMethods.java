package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	public static double geometricSum(int n) {
		double geometricSum=Math.pow((1.0/2.0),n);
		if(n == 0) {
			return 0;
		}else {
			return geometricSum+geometricSum(n - 1);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		
		if(array.length > 0) {
			
		}
		
			return new int[0];
		
	}
	public static int[] toReversedHelper(int i,int[] array) {
		
		if ()
		return toReversedHelper[(i-1,array)];
		
		
	}

	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {

			if (radius>radiusMinimumDrawingThreshold) {
				StdDraw.circle(xCenter, yCenter, radius);
				circlesUponCircles(xCenter+radius,yCenter,radius/3,radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter-radius,yCenter,radius/3,radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter,yCenter+radius,radius/3,radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter,yCenter-radius,radius/3,radiusMinimumDrawingThreshold);
				
			}
	}

}
