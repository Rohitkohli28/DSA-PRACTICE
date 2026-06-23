import com.sun.source.tree.Tree;

import java.util.Scanner;

// Step - 01 Create a Node
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

class TreeOperations{
    static Scanner sc = new Scanner(System.in);

    static TreeNode buildTree(){
        // pick the data and create the Node
        System.out.println("Enter the data of the node: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        TreeNode node = new TreeNode(data);
        System.out.println("Current node is: " + data + " Enter the data for left node");
        node.left = buildTree();
        System.out.println("Current node is: " + data + "Enter the data for right node");
        node.right = buildTree();
        return node;
    }

    static void printPreOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
public class basicTree {

    public static void main(String[] args) {
        TreeNode root =TreeOperations.buildTree();
        TreeOperations.printPreOrder(root);
    }
}
