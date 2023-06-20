package arrayList;

import java.util.ArrayList;

public class pairSum {
    // brute force approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                System.out.print("(" + list.get(i) + "," + list.get(j) + ")");
                if (list.get(i) + list.get(j) == target) {
                    System.out.print("\n" + "(" + list.get(i) + "," + list.get(j) + ")" + "\n");
                    return true;
                }
            }
        }
        return false;
    }

    // optimized approach --> Two pointer approach
    public static boolean pairSum1Optimized(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left != right) {
            if (list.get(left) + list.get(right) == target) {
                return true;
            } else if (list.get(left) + list.get(right) > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        
        System.out.println("Brute force : " + pairSum1(list, 9));
        System.out.println("Optimized : " + pairSum1Optimized(list, 4));
    }

}
