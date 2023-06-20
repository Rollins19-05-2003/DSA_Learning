package OPPS;
public class constructorOPPS {
    public static void main(String[] args) {
        Hello s1 = new Hello();
        Hello s2 = new Hello("sourav");
        Hello s3 = new Hello(456);
    }
}

class Hello{
    Hello(){
        System.out.println("Non-parameterized constructor called");
    }

    Hello(String name){
        System.out.println("Parameterized Constructor called --> " + name);
    }

    Hello(int roll){
        System.out.println("Parameterized Constructor called --> " + roll);
    }
}