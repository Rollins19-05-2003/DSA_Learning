package OPPS;

public class inheritanceMultiLevel extends Dog {
    public static void main(String[] args) {
        Dog d1=new Dog();
        // d1.breathe();
        d1.eat();
        d1.blood();
        d1.breed();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("They eat");
    }

    void breathe() {
        System.out.println("They breathe");
    }
}

class Mammals extends Animal {
    int legs;

    void blood() {
        System.out.println("They are warm-blooded");
    }
}

class Dog extends Mammals {
    void breed() {
        System.out.println("They have many breeds");
    }
}