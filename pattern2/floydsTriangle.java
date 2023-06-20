package pattern2;

public class floydsTriangle {
    public static void main(String[] args) {
        int n=5,counter=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
            }
            System.out.println();
        }
    }
    
}
