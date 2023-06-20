public class abstractClass {

    public abstract class Shape {
        public void display() {
            System.out.println("Shape");
        }

        public abstract void draw();
    }

    public class Square extends Shape {
        public void draw() {
            System.out.println("Square");
        }
  }

    public static void main(String[] args) {
        // Shape sq = new Square();
    }
}