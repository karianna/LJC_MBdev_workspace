package exercise04;

public class Animal { ///1
	
	private int weight; ///1 moved up
	
	public void eat( int mealSize ) { ///1 moved up
		weight+= mealSize / 2;
	}

	public Animal(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() { ///3
		return weight;
	}

}
