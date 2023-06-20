package OPPS;

// method overloading
public class compileTimePolymorphism {
    public static void main(String[] args) {
        calc c = new calc();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
        System.out.println(c.sum(1.6f,2.8f));
    }
}

class calc {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;

    }
}
