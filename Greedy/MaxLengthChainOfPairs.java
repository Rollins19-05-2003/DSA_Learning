package Greedy;
import java.util.*;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = { {5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        // 1st --> sort
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
        // optional to store the pair which has been selected using arraylist
        // ArrayList<Integer> a = new ArrayList<>();

        // 2nd --> select the 1st pair
        int chainLength = 1;
        // a.add(pairs[0][0]);
        
        int lastPairEnd = pairs[0][1];

        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > lastPairEnd){
                chainLength++;
                lastPairEnd = pairs[i][1];  // update
                // a.add(pairs[i][0]);
            }
        }
        System.out.println("Max length of chain is : " + chainLength);
        // for (int i = 0; i < a.size(); i++) {
        //     System.out.print("A["+a.get(i) + "]");
        // }
        // System.out.println();
    
    }
}
