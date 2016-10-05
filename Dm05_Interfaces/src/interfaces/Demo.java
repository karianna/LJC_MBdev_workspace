/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package interfaces;

/**
 *  Section 5.  Interfaces
 */
public class Demo {

	public static void main(String[] args) {
		
		// 1. Both my dwellings can have  sleepIn()  methods:
		// See Building: House, Factory  and Vehicle: Boat, Bike
		House h = new House();
		Boat b = new Boat();
		h.sleepIn();
		b.sleepIn();	/* */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* // 2. We need a common way to refer to different "kinds of" Dwelling  (Object is too vague, has no suitable methods)
		Object x= h;
		x.sleepIn();	/* Need to cast x to House, too specific */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 3. So, Make "dwelling" classes  implement  Dwelling interface, which has (abstract!)  .sleepIn()
		System.out.println( "Part 3..." );
		Dwelling d= b;	// Substitutability
		d.sleepIn();
		d= h;
		d.sleepIn(); 	/* Polymorphism */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 4. Collection of interface types
		System.out.println( "Part 4....");
		Dwelling[] myPads= {h, b, new House()};
		for( Dwelling d0: myPads ) {
			d0.sleepIn();
		} /* */
		
	}

}
