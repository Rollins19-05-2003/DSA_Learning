package recursion;

public class tiles {
    public static void main(String[] args) {
        System.out.println(tilingPROBLEM(4));
    }

    public static int tilingPROBLEM(int n) {
    // base case
    if(n==0 || n==1){
        return 1;
    }
    // vertical choice
    int fnm1 = tilingPROBLEM(n-1);
    // horizantal choice
    int fnm2 = tilingPROBLEM(n-2);

    return fnm1 + fnm2;
    }
}
