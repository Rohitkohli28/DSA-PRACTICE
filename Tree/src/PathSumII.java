import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public void findPaths(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> allPaths) {
        if (node == null) {
            return;
        }

        currentPath.add(node.data);

        if (node.left == null && node.right == null && targetSum == node.data) {
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            findPaths(node.left, targetSum - node.data, currentPath, allPaths);
            findPaths(node.right, targetSum - node.data, currentPath, allPaths);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        new PathSumII().findPaths(root, targetSum, new ArrayList<>(), allPaths);
        return allPaths;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        List<List<Integer>> result = pathSum(root, targetSum);
        System.out.println("Paths with sum " + targetSum + ": " + result);
    }
}