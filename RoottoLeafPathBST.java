import java.util.ArrayList;

public class RoottoLeafPathBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            //left subtree
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static boolean searchBST(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return searchBST(root.left, key);
        }

        else if(root.data == key) {
            return true;
        }

        else{
            return searchBST(root.right, key);
        }
    }
    public static Node deleteaNode(Node root, int val) {
        if(root.data > val){
            root.left = deleteaNode(root.left, val);
        } else if(root.data < val) {
            root.right = deleteaNode(root.right, val);
        } else {
            //case1
            if(root.left == null && root.right == null) {
                return null;
            }
            //case2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            //case3NodeIS
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteaNode(root.right, IS.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printinRange(Node root, int X, int Y) {
        if(root == null) {
            return;
        }
        if(root.data >= X && root.data <= Y) {
            printinRange(root.left, X, Y);
            System.out.println(root.data + " ");
            printinRange(root.right, X, Y);
        } else if(root.data >= Y) {
            printinRange(root.left, X, Y);
        } else {
            printinRange(root.right, X, Y);
        }
    } 
    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }
    public static void root2LeafPath(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null) {
            printPath(path);
        } 
        
        else { // Nonleaf
        root2LeafPath(root.left, path);
        root2LeafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

       
        root2LeafPath(root, new ArrayList<>());
    }
}
