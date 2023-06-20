package OPPS;

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

class Birds extends Animal {
    int legs;

    void fly() {
        System.out.println("They fly");
    }
}
class Fish extends Animal {
    int legs;

    void swim() {
        System.out.println("They swim");
    }
}

public class inheritanceHeiracrchial {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.breathe();
        f.eat();
        f.swim();
    }
}