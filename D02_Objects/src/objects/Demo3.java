/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

/*
 * Section 2. Classes & Objects (part 3)
 */
public class Demo3 {

	public static void main(String[] args) {

		House h= new House();
		System.out.println( "House h = "+ h.getDetails() );
//		System.out.println( "House h = "+ h.toString() );		// Copy .^
//		System.out.println( "House h = "+ h );

		
//		h.numRooms= 6;
//		h.setRooms(6);			/* Setter might validate eg disallow -ve */
		
		
		/* House h2= new House( "Ivy Tower", 400);	
		/* ^1, this.name= name final etc NOTE overrides no-args ctor! */
		
		
		/* House h3= h2;		// Did we copy a House?
		h3.setRooms(2);
		System.out.println( "Who stole 4 rooms from: "+ h2+ "???"); 	// Wr Copy Ctor
		if (h2 == h3) {
			System.out.println( "h2 and h3  are The Same House");
		}
		else {
			System.out.println( "Not same house" );
		} /* */
		
		
		/* if (h2.equals(h3)) {
			System.out.println( "Houses h2 and h3 are The Same");	 	// 
		} 
		else {
			System.out.println( "Not the same" );
		} /* Write .equals */		
		
		
		/* House[] street= new House[15];	 	// Array of Objects, how many House objects got created?
		System.out.println( street );		/* What prints? */
		
		
		/* // Create the House objects, not just the street!
		for (int i= 0; i< street.length; i++) {
			street[i]= new House("?", 4);
		}
		System.out.println( street ); 		/* What prints? */
		
		
		/* for (House h1: street) {
			System.out.println( h1 );
		} /* Better!  */
		
		
		// MORE: LocalDate etc, Google: Java8 API

	}

}
