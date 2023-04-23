package com.learn.optionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassMethodExample {

	public static void main(String[] args) {
		withJava8();
	}
	
	public static void beforeJava8() {
		String[] str=new String[10];
		String lowerCaseValue=str[5].toLowerCase();
		System.out.println(lowerCaseValue);
	}

	private static void withJava8() {
		String[] str=new String[10];
		str[5]="Easy Learning";
		
		Optional<String> empty=Optional.empty();
		System.out.println(empty);
		
		
		Optional<String> value=Optional.of(str[5]);
		System.out.println(value);
		System.out.println(value.get());
		
		//We should of() when we are sure that value will present, otherwise go for ofNullable()
		Optional<String> nullValue=Optional.ofNullable(str[4]);
		System.out.println(nullValue);
		
		nullValue.ifPresent(System.out::println);
		
		System.out.println(nullValue.orElse("No Value"));
		
		Optional<String> nonEmptyOptional=Optional.of("Easy Learning");
		Optional<String> emptyOptional=Optional.empty();
		
		System.out.println("Non-Empty OPtional"+nonEmptyOptional.map(String::toUpperCase));
		System.out.println("Empty Optional"+emptyOptional.map(String::toUpperCase));
		
		//Layer of Optional
		Optional<Optional<String>> nonEmptyOptionalInput=Optional.of(Optional.of("Easy Learning"));
		System.out.println("Optional Value : "+nonEmptyOptionalInput);
		
		//Map on Optional
		System.out.println("Optional.map"+nonEmptyOptionalInput.map(input -> input.map(String::toUpperCase)));
		System.out.println("Optional.flatmap"+nonEmptyOptionalInput.flatMap(input -> input.map(String::toUpperCase)));
		
		Optional<String> country=Optional.of("India");
		Optional<String> emptyCountry=Optional.empty();
		
		System.out.println(country.filter(inp -> inp.equals("india")));
		System.out.println(country.filter(inp -> inp.equalsIgnoreCase("india")));
		System.out.println(emptyCountry.filter(inp -> inp.equalsIgnoreCase("india")));
		
		
		if(country.isPresent())
			System.out.println("Value Available");
		
		country.ifPresent(c -> System.out.println("In Country Option, value availabe :"+c));
		//condition failed
		emptyCountry.ifPresent(c -> System.out.println("In Country Option, value availabe :"+c));
		
		System.out.println(country.orElse("NoDataAvailable"));
		System.out.println(emptyCountry.orElse("No Data Available"));
		System.out.println(emptyCountry.orElseGet(()->"No Available")); //Supplier
		System.out.println(emptyCountry.orElseThrow(NoSuchElementException::new));
		
				
		
 		
		
		
		
	}
}
