package association;

public class Demo {

	public static void main(String[] args) {

		// Step 1 (Add ctor)
		House h= new House( "Burton Towers", 3 );	
		System.out.println( h );

		// Step 2
		Door front= new Door( "Front", 82, true );
		System.out.println( front );

		// Step 3
		h.addDoor(front);
		h.addDoor( new Door("Back", 72, false) );
		System.out.println( h );

	}

}
