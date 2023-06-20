package arrayList;
import java.util.ArrayList;
public class max {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(2);
            list1.add(5);
            list1.add(9);
            list1.add(3);
            list1.add(6);

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < list1.size(); i++) {
                // if (list1.get(i)>max) {
                //     max = list1.get(i);
                // }

                max = Math.max(max, list1.get(i));
            }
        System.out.println("Maximum element in the list is : " + max);
    }
}
