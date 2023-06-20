package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class chocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1
        // 1st --> sort in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int hc = 0, vc = 0; // c --> cut
        int hp = 1, vp = 1; // p --> pieces
        int finalCost = 0;

        while (hc < costHor.length && vc < costVer.length) {
            // vertical cost < hor cost
            if (costVer[vc] <= costHor[hc]) { // then hor cut
                finalCost = finalCost + (costHor[hc] * vp);
                hp++;
                hc++;
            } else { // vertical cut
                finalCost = finalCost + (costVer[vc] * hp);
                vp++;
                vc++;
            }
        }
        while (hc < costHor.length) {
            finalCost = finalCost + (costHor[hc] * vp);
            hp++;
            hc++;
        }
        while (vc < costVer.length) {
            finalCost = finalCost + (costVer[vc] * hp);
            vp++;
            vc++;
        }

        System.out.println("Minimun cost of cut required : "+finalCost);
    }
}
