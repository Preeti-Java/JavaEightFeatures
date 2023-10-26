/**
 * 
 */
package com.learning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */
public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1995, 3, 27);
		LocalTime time = LocalTime.of(11, 11,11);
		LocalDateTime dateTime = LocalDateTime.of(1995,3,27,11,11,11);
		System.out.println("Giev Date and Time :"+ dateTime);
		
		LocalDateTime dateTimeVal = LocalDateTime.of(date, time);
		LocalDate localDate = dateTimeVal.toLocalDate();
		System.out.println("LocalDate : "+localDate);
		LocalTime localTime = dateTimeVal.toLocalTime();
		System.out.println("LocalTime : "+localTime);
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println("Current Time : "+today);
		
		System.out.println("Is After : "+dateTime.isAfter(today));
		System.out.println("Is Before : "+dateTime.isBefore(today));
		System.out.println("Is Equal : "+dateTime.isEqual(today));
		
		System.out.println("Add  Year : "+ today.plusYears(5));
		System.out.println("Minus  month : "+today.minusMonths(2));
		
		
	}
}
