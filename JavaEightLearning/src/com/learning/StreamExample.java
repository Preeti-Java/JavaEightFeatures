/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 */
public class StreamExample {

	public static void main(String[] args) {
		
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");
		deptList.add("Social");
		deptList.add("IT");
		
		
		Stream<String> deptStream = deptList.stream();
		deptStream.forEach(System.out::println);
		
		//Creating a stream
		Stream<String> colorStream = Stream.of("Red","Black","Blue");
		colorStream.forEach(System.out::println);
		
		//Parallel Stream
		Stream<String> parallelStream = deptList.parallelStream();
		parallelStream.forEach(System.out::println);
		
		//Empty Stream
		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
	}
}
