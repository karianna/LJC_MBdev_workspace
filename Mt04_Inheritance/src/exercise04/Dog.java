package exercise04;

public class Dog extends Animal { ///1

	private String name;

	public Dog(String name, int weight) { ///3
		super(weight);
		this.name = name;
	}

	@Override
	public String toString() { ///3
		return "Dog [name=" + name + ", getWeight()=" + getWeight() + "]";
	}

	
}
