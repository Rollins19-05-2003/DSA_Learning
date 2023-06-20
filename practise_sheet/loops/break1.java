package loops;
import java.util.*;
public class break1 {

    //break Ques
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep entering even number : ");
        while (true) {
            int num=sc.nextInt();
            if (num%2!=0) {
                System.out.println("You entered an odd number");
                break;
            }
            
        }
    }
    
}
