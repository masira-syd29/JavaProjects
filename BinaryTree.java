import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;
    
    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}
    
public class BinaryTree {
    TreeNode root;
    
        // Constructor
     BinaryTree() {
        root = null;
     }
    
        // Function to find sum of nodes at k-th level
    int sumNodesAtKthLevel(TreeNode node, int k) {
         if (node == null)
             return 0;
    
         if (k == 0)
             return node.value;
    
            // Recur for left and right subtrees
            return sumNodesAtKthLevel(node.left, k - 1) + sumNodesAtKthLevel(node.right, k - 1);
        }
    
        // Driver method to test the above function
        public static void main(String args[]) {
            BinaryTree tree = new BinaryTree();
    
            // Constructing the tree
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            tree.root.right.left = new TreeNode(6);
            tree.root.right.right = new TreeNode(7);
    
            int k = 2; // Level for which sum is required
            System.out.println("Sum of nodes at level " + k + " is " + tree.sumNodesAtKthLevel(tree.root, k));
        }
    }
    

