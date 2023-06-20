package arrayList;
import java.util.ArrayList;
public class containerWithMostWater {
// brute force approach 
    public static int storeWater(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                max = Math.max(max, currWater);
            }
        }
        return max;
    }  

// optimized approach   --> Two pointer approach
    public static int storeWaterOptimized(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while (lp<rp) {
            // calculate water area
            int ht = Math.min(height.get(rp),height.get(lp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (lp<rp) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(7);
        System.out.println("Brute force approach "+storeWater(list1));
        System.out.println("Two pointer approach "+storeWaterOptimized(list1));
    }
}
