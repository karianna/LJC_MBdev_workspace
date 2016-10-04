package exercise04;

public class Cat extends Animal { /// 1 add 'extends'

	private String name;

	public Cat(String name, int weight) {
//		this.weight= weight;
		super(weight);	/// 2 was ^
		this.name = name;
	}
	
	@Override
	public String toString() {
//		return "Cat [name=" + name + ", weight=" + weight + "]";
		return "Cat [name=" + name + ", weight=" + getWeight() + "]";	///3 was^
	}
	
}
