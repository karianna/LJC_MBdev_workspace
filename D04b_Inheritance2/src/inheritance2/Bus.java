package inheritance2;

public class Bus extends Vehicle {

	private int takings;

	public Bus(String make, String model) {
		super( make, model );
	}

	public void payFare( int f ) {
		takings+= f;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Honk Honk!" );
	}

	@Override
	public void showModel() {	/// 4.
		super.showModel();
		System.out.print( " Bus. " );
	}

}
