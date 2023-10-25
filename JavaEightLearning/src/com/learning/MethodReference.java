/**
 * 
 */
package com.learning;

/**
 * 
 */
public class MethodReference {

	public static void main(String[] args) {
		staticMethodReference();
	}

	/**
	 * 
	 */
	private static void staticMethodReference() {
		ArithmeticOperation arOp = (a,b) -> {
			int sum = a + b;
			return sum;
		};
		
		arOp.performOperation(3, 5);
		
		//Method Reference
		ArithmeticOperation aO = MethodReference::performAdd;
		aO.performOperation(3, 5);
	}
	
	public  static int performAdd(int a, int b) {
		return a + b;
		
	}
	
}
