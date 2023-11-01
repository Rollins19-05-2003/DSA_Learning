package array;
// 3sum
import java.util.* ;
public class q3 {
    
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
	    // Write your code here.
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < K) {
                    j++;
                } else if (sum > K) {
                    k--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
					temp.addAll(Arrays.asList(arr[i], arr[j], arr[k]));
					
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
		
	}
}
