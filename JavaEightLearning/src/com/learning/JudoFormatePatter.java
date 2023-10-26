/**
 * 
 */
package com.learning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 */
public class JudoFormatePatter {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		String basicFormate = today.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(basicFormate);
		
		String localFormate =  today.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localFormate);
		
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		String perfectDate = today.format(formate);
		System.out.println(perfectDate);
	}
	
}
