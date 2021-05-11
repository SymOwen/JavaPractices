import people.Person;


public class Enum {

	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		Person p1 = new Person("Amy", Person.Gender.FEMALE);
		Person p2 = new Person("John", Person.Gender.MALE);
		p1.jump();
		p1.run();
		p1.laugh();
		p2.jump();
		p2.run();
		p2.laugh();
		System.out.println(p1.getName() + ' ' + p1.getGender());
		System.out.println(p2.getName() + ' ' +  p2.getGender());
	}
}

