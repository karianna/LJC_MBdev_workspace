package inheritance;

public class Car extends Vehicle {

	private int fuelLevel;

	public void addFuel( int litres ) {
		fuelLevel+= litres;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Toot toot" );
	}

}
