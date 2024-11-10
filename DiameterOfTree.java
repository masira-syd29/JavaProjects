import java.util.*;

public class DiameterOfTree {
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
    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    } 
    public static int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    public static int diameterOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;

        }
    }
    public static TreeInfo diameterOfTree2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfTree2(root.left);
        TreeInfo right = diameterOfTree2(root.right);

        int myHeight = Math.max(left.ht, right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht +1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.bulidTree(nodes);
        
        System.out.println(diameterOfTree2(root).diam);
    }


    
}