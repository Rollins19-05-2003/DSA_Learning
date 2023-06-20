package Graph5;

public class floodFillAlgo {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int oriCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != oriCol ) {
            return;
        }
        //left
        helper(image,sr,sc-1,color,vis,oriCol);
        // right
        helper(image,sr,sc+1,color,vis,oriCol);
        // down
        helper(image,sr+1,sc,color,vis,oriCol);
        // up
        helper(image,sr-1,sc,color,vis,oriCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

    }
}
