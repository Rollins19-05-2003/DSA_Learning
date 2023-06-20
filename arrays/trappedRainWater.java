package arrays;
public class trappedRainWater {

    public static int TrappedWater(int height[]) {
        int n = height.length;
        // left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1]= height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        // calculate water level and trapped water
        for (int i = 0; i < n; i++) {
            //water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }


    // public static int TrappedWater(int num[]) {
    //     int n = num.length;
    //     // left max boundary
    //     int leftMax[] = new int[n];
    //     leftMax[0] = num[0];
    //     for (int i = 1; i < n; i++) {
    //         leftMax[i] = Math.max(num[i], leftMax[i-1]);
    //     }

    //     // right max boudary
    //     int rightMax[] = new int[n];
    //     rightMax[n-1] = num[n-1];
    //     for (int i = n-2; i >= 0; i--) {
    //         rightMax[i] = Math.max(num[i], rightMax[i+1]);
    //     }

    //     // water Level
    //     int trappedWater = 0;
    //     int width = 1;
    //     for (int i = 0; i < n; i++) {
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
    //         trappedWater  += (waterLevel - num[i])*width;
    //     }

    //     return trappedWater;
    // }
    public static void main(String[] args) {
        // int height[] = {4,2,0,6,3,2,5};
        int height[] = {4,2,0,3,2,5};
        System.out.println(TrappedWater(height));
    }
    
}
