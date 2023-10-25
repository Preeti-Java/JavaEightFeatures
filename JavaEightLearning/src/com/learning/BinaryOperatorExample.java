/**
 * 
 */
package com.learning;

import java.util.function.BinaryOperator;

/**
 * 
 */
public class BinaryOperatorExample {

	public static void main(String[] args) {
		binaryOperatorEx();
	}

	/**
	 * 
	 */
	private static void binaryOperatorEx() {
		
		//Creating a BinaryOperator
		BinaryOperator<String> appendAndConvert = (word1,word2) -> (word1 + word2).toUpperCase();
		
		//Calling BinaryOperator method
		System.out.println("Appending : " + appendAndConvert.apply("Preeti", "Rani"));
		
		//maxBy
		BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println("Max By " + maxOperation.apply(30, 40));
		
		//minBy
		BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a,b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println("Min By "+ minOperation.apply(30, 40));
		
	}
}
