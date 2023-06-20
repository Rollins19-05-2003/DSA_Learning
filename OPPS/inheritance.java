package OPPS;
// single-level inheritance
public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
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

class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("Yes, They can swin!!");
    }
}