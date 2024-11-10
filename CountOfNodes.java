import java.util.*;

public class CountOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 
    static class BinaryTree {
        static int idx = -1;
        public static Node bulidTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = bulidTree(nodes);
            newNode.right = bulidTree(nodes);

            return newNode;
        }
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static void levelOrder(Node root) {
        if(root == null){
            return;
        } 
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node curNode = q.remove();
            if(curNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if(curNode.left != null) {
                    q.add(curNode.left);
                }
                if(curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftnodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftnodes + rightNodes + 1;

    } 

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.bulidTree(nodes);
        
        System.out.println(countOfNodes(root));
    }


    
}//tc --> O(n)
