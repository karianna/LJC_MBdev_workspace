package inheritance;

public class Bus extends Vehicle {

	private int takings;

	public void payFare( int f ) {
		takings+= f;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Honk Honk!" );
	}
	
}
