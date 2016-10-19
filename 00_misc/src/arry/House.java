package arry;


public class House {

	private int numRooms= 4;

	House() {
		System.out.println( "Constructing a House" );
	}

	public String toString() {
		return "House details: numRooms= "+ numRooms;
	}

}
