package arry;

public class Demo {

	public static void main(String[] args) {
		
		House[] myStreet= new House[5];
		System.out.println( myStreet );	// And how many Houses got created? (ctor(covered later) message)
		
		for (int i=0; i<myStreet.length; i++)
			myStreet[i]= new House();

		System.out.println( myStreet );

		for (House h: myStreet)
			System.out.println( h );
	}

}
