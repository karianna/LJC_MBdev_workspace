/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

import java.util.Scanner;

/*
 * Section 2. Classes & Objects
 */
public class Demo {

	public static void main(String[] args) {
		
		int i= 0;
		Scanner aScanner;
		
		aScanner= new Scanner( System.in);
		System.out.println( "Age? ");	// Keep user informed! 
		i= aScanner.nextInt();			// Remember to click in Eclipse console window
		System.out.println( "Happy "+ i+ "th birthday!" );

		
		/* next */
		// MORE: LocalDate etc, Google: Java8 API
	}

}
