public class Inheritance {
    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        Animal newAnimal = new Animal("Paul", 0);
        newAnimal.getName();
        System.out.println(newAnimal.getId());
        Dog newDog = new Dog("Bob", 1, "Owen");
        newDog.getName();
        Animal tmp = new Dog("Tmp", -1, "TMP");
        System.out.println(newDog.getId());
        newDog.bark();
    }
}


