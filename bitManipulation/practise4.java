package bitManipulation;

public class practise4 {
    // Convert uppercase characters to lowercase using bits.
    public static void main(String[] args) {
        for (char i = 'A'  ; i <='Z'; i++) {
            System.out.print((char)(i | ' ') + " ");
        }
    }
}
