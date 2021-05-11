package people;

public class Person implements PersonInterface {
	public enum Gender {
		MALE, FEMALE
	}

	private String name;
	private Gender gender;

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("The " + this.gender + " named " + this.name + " is running");
	}

	@Override
	public void jump() {
		System.out.println("The " + this.gender + " named " + this.name + " is jumping");
	}

	public void laugh() {
		System.out.println("The " + this.gender + " named " + this.name + " is laughing");
	}
}
