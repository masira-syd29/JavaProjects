public class DeleteaNode {
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
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        deleteaNode(root, 5);
        inOrder(root);
    }
}
