package OPPS;
public class abstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();  
        Chicken c = new Chicken();
        // System.out.println(h.color);   
        // h.eat();
        // h.walk();
        // h.changeColor();

        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    // we can make a constructor of an abstract class
    Animal() {
        System.out.println("Animal constructor called");
        color = "brown";
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {
    
    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("They walk on 4 legs");
    }

    Horse() {
        System.out.println("Horse constructor called");
    }

}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("They walk on 2 legs");
    }
}