package association;

import java.util.Arrays;

public class House {

	private String name;
	private int numRooms= 4;
	private int numDoors= 0;	/// Delete, add in demo BEFORE []doors so generated toString() looks good
	private Door[] doors;		/// Delete, add in demo

	public House(String name, int numRooms) {
		this.name = name;
		this.numRooms = numRooms;
		doors= new Door[numRooms + 2];	// Should be enough!  /// Delete, add in demo
	}


	public String toString() {
		return "House [name=" + name + ", numRooms=" + numRooms + ", numDoors=" + numDoors + ", doors="
				+ Arrays.toString(doors) + "]";
	}

	public void addDoor(Door d) {
		doors[numDoors++]= d;
	}

}
