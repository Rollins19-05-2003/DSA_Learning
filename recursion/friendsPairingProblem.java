package recursion;

public class friendsPairingProblem {

    public static int friendsPairingProblemMethod(int n) {
        // base case
        if (n==1 || n==2) {
            return n;
        }

        // // kamm
        // //single --> 
        // int single = friendsPairingProblemMethod(n-1);
        // //pair -->
        // int pair = (n-1) * friendsPairingProblemMethod(n-2);

        // //total ways
        // int total = single + pair;
        // return total;

        // single line code
        return friendsPairingProblemMethod(n-1) + (n-1)*friendsPairingProblemMethod(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairingProblemMethod(3));
    }
    
}
