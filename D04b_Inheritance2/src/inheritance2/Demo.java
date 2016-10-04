/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package inheritance2;

/**
 *  Section 4. Inheritance
 */
public class Demo {

	public static void main(String[] args) {

		// 1. Substitutability, base ref vbl can refer to sub-class object (but not vice versa)
		Car c2= new Car( "Datsun", "Cherry" );	
		Vehicle v= c2;		// But cant do:  c2= v;
		v.alertWalkers();
		v= new Bus( "Dennis", "Routemaster" );
		v.alertWalkers();	/* Same call, different action, Polymorphism! */

		
		/* // 2. How does a `Vehicle` alert walkers
		Vehicle v2= new Vehicle( "Some", "Vehicle" );
		System.out.println( "Vehicle about to alert walkers:" );
		v2.alertWalkers();	// Can't !!
		System.out.println( "Did you hear that??" );
		/*  - Need to know what "kind" of Vehicle, ie no such thing as a Vehicle ("Give me a Vehicle") (or Fruit or Sweet) => Abstract*/

	
		// 3. So make  Vehicle  & its  alertWalkers()  abstract, 
		//	  so cant do new Vehicle as above, need to create specific kinds.
		//    And note error now in Bike, "effectively abstract"
		System.out.println( "Part 3......" );
		Vehicle v3= c2;
		v3.alertWalkers();
		v3= new Bike( "Santa Cruz", "Blur" );
		v3.alertWalkers();	/* */


		// 4. Array of base (even abstract) references:
		System.out.println( "Part 4...." );
		Vehicle traffic[]= {v3, c2, v};
		for (Vehicle v0: traffic) {
			v0.showModel();		// And add  .showModel() calling super. to Bike, Bus, Car  then print (not println) " Car. " etc
			v0.alertWalkers();
		} /* **Mention protected */

	}

}








