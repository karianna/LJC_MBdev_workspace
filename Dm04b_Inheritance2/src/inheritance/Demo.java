/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package inheritance;

/**
 *  Section 4. Inheritance
 */
public class Demo {

	public static void main(String[] args) {

		// 1. Substitutability, base ref vbl can refer to sub-class object (but not vice versa)
		Vehicle v= new Car( "Datsun", "Cherry" );	// ie cant do Car= v;
		v.alertWalkers();
		
		v= new Bus( "Dennis", "Routemaster" );
		v.alertWalkers();	/* Same call, different action, Polymorphism! */


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 2. How does a `Vehicle` alert walkers
		Vehicle v2= new Vehicle( "Some", "Vehicle" );
		System.out.println( "Vehicle about to alert walkers:" );
		v2.alertWalkers();	// Can't !!
		System.out.println( "Did you hear that??" );
		/*  - Need to know what "kind" of Vehicle, ie no such thing as a Vehicle ("Give me a Vehicle") (or Fruit or Sweet) => Abstract*/


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* // 3. with abstract Vehicle, cant do new Vehicle as above, need to create specific kinds.
		//    And note error now in Bike, "effectively abstract"
		System.out.println();
		Vehicle v3= c2;
		v3.alertWalkers();
		v3= new Bike( "Santa Cruz", "Blur" );
		v3.alertWalkers();	/* */


		
		
		
		
		
		
		
		
		
		
		
		
		/* // 4. Array of base (even abstract) references:
		System.out.println();
		Vehicle traffic[]= {c, v3, c2, v};
		for (Vehicle v0: traffic) {
			v0.showModel();		// And fix Bike, Bus .showModel() as per Car
			v0.alertWalkers();
		} /* **Mention protected */

	}

}








