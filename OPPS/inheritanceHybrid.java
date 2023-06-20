package OPPS;


public class inheritanceHybrid {
    public static void main(String[] args) {
        Shark s = new Shark();
        s.eat();
        s.breathe();
        s.swim();
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
class Human extends Mammals{
    void work()
    {
        System.out.println("They work for the society");
    }
}


class Birds extends Animal {
    void fly() {
        System.out.println("They fly");
    }
}

class Peacock extends Birds{
    void feather()
    {
        System.out.println("They have long feather");
    }
}
class Fish extends Animal {
    int legs;

    void swim() {
        System.out.println("They swim");
    }
}
class Shark extends Fish{
    void eat()
    {
        System.out.println("They eat small fish");
    }
}

