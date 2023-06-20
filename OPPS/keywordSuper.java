package OPPS;

public class keywordSuper {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal()
    {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse()
    {
        super.color = "Brown";      //assigning value to a parent variable from child method using super keyword
        // super();    
        // same output will be printed if super is used or not because horse consrructor will first called its parent class constructor and then its own constructor
        System.out.println("Horse constructor called");
    }
}