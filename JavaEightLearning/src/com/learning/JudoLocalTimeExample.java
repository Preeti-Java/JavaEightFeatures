/**
 * 
 */
package com.learning;

import java.time.LocalTime;

/**
 * 
 */
public class JudoLocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.of(12,30,10);
		
		int hour = time.getHour();
		System.out.println("Give Hour is:"+hour);
		
		int minute = time.getMinute();
		System.out.println("Give Minute is:"+minute);
		
		int second = time.getSecond();
		System.out.println("Give Second is:"+second);
		
		LocalTime parseTime = LocalTime.parse("12:30:10");
		System.out.println("Given Parse Time is:"+parseTime);
		
		LocalTime currentTime	= LocalTime.now();
		System.out.println("Given Current Time is:"+currentTime);
		
	}
}
