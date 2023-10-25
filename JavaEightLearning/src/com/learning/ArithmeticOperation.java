/**
 * 
 */
package com.learning;

/**
 * 
 */
@FunctionalInterface
public interface ArithmeticOperation {
	
	public int performOperation(int a, int b);
	
	public default void performAdd(int a, int b) {
		int res = a +b;
		printTheInput(res);
	}

	/**
	 * @param res
	 */
	public static void printTheInput(int res) {
		System.out.println(res);
	}

}
