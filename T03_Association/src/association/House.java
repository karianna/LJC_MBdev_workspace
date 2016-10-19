package association;

public class House {

	private String name;
	private int numRooms= 4;

	public House(String name, int numRooms) {
		this.name = name;
		this.numRooms = numRooms;
	}

	public String toString() {
		return "House [name=" + name + ", numRooms=" + numRooms + "]";
	}

}
