import javax.swing.JFrame;
import java.awt.*;

public class swingDemo extends JFrame {
    public swingDemo() {
        setLayout(new BorderLayout());
        Button bt1 = new Button("Save");
        Button bt2 = new Button("Delete");
        Button bt3 = new Button("Update");
        Button bt4 = new Button("Edit");
        Button bt5 = new Button("Submit");

        add(bt1, "NORTH");
        add(bt2, "WEST");
        add(bt3, "EAST");
        add(bt4, "SOUTH");
        add(bt5, "CENTER");

        setTitle("Hello");
        setSize(350, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new swingDemo();

    }
}
