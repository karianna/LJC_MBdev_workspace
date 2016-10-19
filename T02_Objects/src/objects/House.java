/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

/*
 * Section 2. Classes & Objects (part 3)
 */
public class House {

	public int numRooms= 4; 	// Data (state) should be private

	public String getDetails() {
		return "House details: numRooms= "+ numRooms;
	}

	public String toString() {
		return "House details: numRooms= "+ numRooms;
	}

	/* public boolean equals(Object obj) {	/// 12.
		House other = (House) obj;
		if (!name.equals(other.name))
			return false;
		if (numRooms != other.numRooms)
			return false;
		return true;
	} /* So we can just un-comment for speed.
		 MORE: See ALT+CMD+S> Generate equals() and hashCode() */

}
