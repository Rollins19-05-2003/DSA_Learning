
//     public static void main(String[] args) {
//         int N = 7;
//         int[] A = {0, 1, 2, 1, 4, 4};
//         int[] B = {1, 2, 0, 4, 5, 6};

//         int[] A1 = {0, 1, 2, 4, 5};
//         int[] B1 = {1, 2, 3, 5, 6};
        
//         int seconds = secondsToStopDisappearing(N, A, B);        
//         int seconds1 = secondsToStopDisappearing(N, A1, B1);

//         System.out.println("It takes " + seconds + " seconds for the vertices to stop disappearing.");        
//         System.out.println("It takes " + seconds1 + " seconds for the vertices to stop disappearing.");

//     }
// }



import java.util.*;

public class ques1 {
    public static int secondsToStopDisappearing(int N, int[] A, int[] B) {
        Map<Integer, Set<Integer>> adjacencyList = new HashMap<>();
        

        for (int i = 0; i < A.length; i++) {
            int vertex1 = A[i];
            int vertex2 = B[i];
            
            adjacencyList.computeIfAbsent(vertex1, k -> new HashSet<>()).add(vertex2);
            adjacencyList.computeIfAbsent(vertex2, k -> new HashSet<>()).add(vertex1);
        }
        
        int seconds = 0;
        
        while (true) {
            List<Integer> verticesToRemove = new ArrayList<>();
            

            for (int vertex : adjacencyList.keySet()) {
                if (adjacencyList.get(vertex).size() <= 1) {
                    verticesToRemove.add(vertex);
                }
            }
            

            if (verticesToRemove.isEmpty()) {
                break;
            }
            

            for (int vertex : verticesToRemove) {
                Set<Integer> connectedVertices = adjacencyList.get(vertex);
                for (int connectedVertex : connectedVertices) {
                    adjacencyList.get(connectedVertex).remove(vertex);
                }
                adjacencyList.remove(vertex);
            }
            
            seconds++;
        }
        
        return seconds;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] A = {0, 1, 2};
        int[] B = {1, 2, 0};
        
        int seconds = secondsToStopDisappearing(N, A, B);
        System.out.println("It takes " + seconds + " seconds for the vertices to stop disappearing.");

        
    }
}
