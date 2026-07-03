import java.util.Stack;
public class ZigZagTraversal {

    public static void zigZagTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        boolean leftToRight = true;

        currentLevel.push(root);

        while (!currentLevel.isEmpty()) {
            TreeNode currentNode = currentLevel.pop();
            System.out.print(currentNode.data + " ");

            if (leftToRight) {
                if (currentNode.left != null) {
                    nextLevel.push(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.push(currentNode.right);
                }
            } else {
                if (currentNode.right != null) {
                    nextLevel.push(currentNode.right);
                }
                if (currentNode.left != null) {
                    nextLevel.push(currentNode.left);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        zigZagTraversal(root);
    }
}
