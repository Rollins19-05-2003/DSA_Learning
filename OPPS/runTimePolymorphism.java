package OPPS;
// method overriding : parent and child classes both contain the same function with a different definition
public class runTimePolymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("They eat anything");
    }
}

class Deer extends Animal{
    void eat() {
        System.out.println("They eat grass only");
    }
}
