package animals;

public class Cat extends Animal {

	String ownerName;

	public Cat(String name, int id, String ownerName) {
		super(name, id);
		this.ownerName = ownerName;
	}

	public void getName() {
		System.out.println("This cat's name is " + this.name + " owned by " + this.ownerName);
	}
}