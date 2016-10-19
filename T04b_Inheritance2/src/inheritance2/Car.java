package inheritance2;

public class Car extends Vehicle {

	private int fuelLevel;

	public Car(String make, String model) {
		super( make, model );
	}

	public void addFuel( int litres ) {
		fuelLevel+= litres;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Toot toot" );
	}

}
