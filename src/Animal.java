class Animal {
    public String name;
    public int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void getName() {
        System.out.println("This animal's name is " + this.name);
    }

}


class Dog extends Animal {

    String ownerName;

    public Dog(String name, int id, String ownerName) {
        super(name, id);
        this.ownerName = ownerName;
    }

    public void getName() {
        System.out.println("This dog's name is " + this.name + " owned by " + this.ownerName);
//        System.out.println(this.getClass().getSimpleName());
//        if (this.getClass().getName().equals("Animal"))
//            super.getName();
    }



    public void bark() {
        System.out.println(this.name + " is barking");
    }
}

class Cat extends Animal {
    String ownerName;

    public Cat(String name, int id, String ownerName) {
        super(name, id);
        this.ownerName = ownerName;
    }

    public void getName() {
        System.out.println("This cat's name is " + this.name + " owned by " + this.ownerName);
    }
}