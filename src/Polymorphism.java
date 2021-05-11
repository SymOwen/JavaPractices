import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Polymorphism {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Animal animal = new Animal("Animals.Animal", 0);
        Dog dog = new Dog("Animals.Dog", 1, "Owner1");
        Cat cat = new Cat("Animals.Cat", 2, "Owner2");
        getName(animal);
        getName(dog);
        getName(cat);
    }

    public static void getName(Animal animal) {
        if (animal instanceof Dog) {
            Dog tmp = (Dog) animal;
            tmp.getName();
        } else if (animal instanceof Cat) {
            Cat tmp = (Cat) animal;
            tmp.getName();
        } else
            animal.getName();
    }

}
