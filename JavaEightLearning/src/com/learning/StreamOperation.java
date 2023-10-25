/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Stream Operation
 */
public class StreamOperation {

	public static void main(String[] args) {
		
		//Creating a ArrayList
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");	
		deptList.add("Social");
		deptList.add("IT");
		deptList.add("Marketing");
		
		//Printing dept by stream
		deptList.stream().map(dept -> dept.toUpperCase()).forEach(System.out::println);
		
		//Flatmap
		flatMapInStream();
		
		//Filter
		filterInStream();
		
		//Limit In Stream
		limitInStream();
		
		//Skip In stream
		skipInStream();
	}

	/**
	 * Skip In Stream
	 */
	private static void skipInStream() {
		System.out.println("=========================");
		Stream.iterate(1, n -> n+1).skip(10).limit(25).forEach(System.out::println);
	}

	/**
	 * Limit In Stream
	 */
	private static void limitInStream() {
		System.out.println("=========================");
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
	}

	/**
	 * filter Stream
	 */
	private static void filterInStream() {
		//Creating a ArrayList
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");	
		deptList.add("Social");
		deptList.add("IT");
		deptList.add("Marketing");
		
		System.out.println("=========================");
		
		Stream<String> list =  deptList.stream();
		list.filter(e -> e.contains("i")).forEach(System.out::println);
	}

	/**
	 *  FlatMap
	 */
	private static void flatMapInStream() {
		System.out.println("=========================");
		// 1st Example
		String[] arrayOfWords = {"Eazy","Bytes"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));
		streamOfLetters.forEach(System.out::println);
		
		System.out.println("=========================");
		//2nd Example
		List<List<String>> list = Arrays.asList(Arrays.asList("Preeti"),Arrays.asList("Rani"));
		System.out.println(list);
		
		list.stream().map(Collection::stream).forEach(System.out::println);
		list.stream().flatMap(Collection::stream).forEach(System.out::println); //Convert into single stream
		
	}
}
