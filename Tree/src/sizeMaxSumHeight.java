public class sizeMaxSumHeight {
    // static int size = 0;

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

//
//    public static void preOrder(Node root){
//        if(root == null) return;
//            // System.out.print(root.val);
//        size++;
//            preOrder(root.left);
//            preOrder(root.right);
//        }

    public static int size(Node root){
        if(root == null){
            return 0;
        }
        int s1 = size(root.left);
        int s2 = size(root.right);
        return s1 + s2 + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int s1 = sum(root.left);
        int s2 = sum(root.right);
        return root.val + s1 + s2;
    }

    public static int product(Node root){
        if(root == null) return 1;
        int s3 = product(root.left);
        int s4 = product(root.right);
        return root.val * s3 * s4;
    }

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }

    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }



    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(9);
        b.right = e;
        b.left = f;
        // preOrder(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(product(root));
        System.out.println(max(root));
        System.out.println(min(root));
        System.out.println(height(root));
    }
}
