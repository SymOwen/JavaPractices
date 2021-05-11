package animals;

public class Animal {

	public String name;
	public int id;

	public Animal(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getName() {
		System.out.println("This animal's name is " + this.name);
	}

}
