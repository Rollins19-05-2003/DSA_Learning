package function;

public class palindrome {

    public static void isPalindrome(int number)
    {
        int myNum = number;
        int rem ,rev=0;
        while (number>0) {
            rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;
        }

        if (rev==myNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(0);
    }
    
}
