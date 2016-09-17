package association;

import java.util.Arrays;

public class House {

	private String name;
	private int numRooms= 4;
	private Door[] doors;	///
	private int numDoors;	///
	
	public House(String name, int numRooms) {
		this.name = name;
		this.numRooms = numRooms;
		doors= new Door[numRooms];	///
	}
	
	public void addDoor(Door d) {	/// 
		doors[numDoors++]= d;
	}
	
//	public String toString() {
//		return "House [name=" + name + ", numRooms=" + numRooms + "]";
//	}
/// Put back original ^
	@Override
	public String toString() {
		return "House [name=" + name + ", numRooms=" + numRooms + ", doors=" + Arrays.toString(doors) + ", numDoors="
				+ numDoors + "]";
	}

}
