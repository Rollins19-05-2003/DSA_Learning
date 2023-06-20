package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // if end time was not sorted then it would be done by the following piece of code
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;   // original index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //  lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxActivity = 1;
        ans.add(activities[0][0]); // 0 is the index of 1st element of end
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxActivity++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }



        // end time basis sort  --> already done in this ques

        // int maxActivity = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // //1st activity
        // maxActivity = 1;
        // ans.add(0); // 0 is the index of 1st element of end
        // int lastEnd = end[0];

        // for (int i = 1; i < end.length; i++) {
        //     if (start[i]>= lastEnd) {
        //         maxActivity++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        System.out.println("Max Activities = "+maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i) + " ");
        }
        System.out.println();
    }
}
