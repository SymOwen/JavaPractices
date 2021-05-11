package animals;

public class Dog extends Animal {

	String ownerName;

	public Dog(String name, int id, String ownerName) {
		super(name, id);
		this.ownerName = ownerName;
	}

	public void getName() {
		System.out.println("This dog's name is " + this.name + " owned by " + this.ownerName);
	}


	public void bark() {
		System.out.println(this.name + " is barking");
	}
}