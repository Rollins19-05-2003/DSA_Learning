package Binary_Tree;

public class diameterOfTree {
    // it is the number of nodes in the longest path between 2 leaves
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        int height = Math.max(leftH, rightH) + 1;
        return height;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(Math.max(rightDiam, leftDiam), selfDiameter);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the tree is : "+height(root));
        System.out.println("Diamater of a Root is : " + diameter(root));
    }
}
