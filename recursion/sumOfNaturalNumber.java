package recursion;

public class sumOfNaturalNumber {
    public static int calcSum(int n) {
        if(n==1){   //base case 
            return 1;
        }
        int sum = calcSum(n-1);
        int result = n + sum;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcSum(10));
    }
} 
