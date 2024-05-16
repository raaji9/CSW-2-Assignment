class TreeNode2 {
    int val;
    TreeNode2 left, right;

    public TreeNode2(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTr {
    TreeNode2 root;

    public TreeNode2 deleteNode(TreeNode2 root, int key) {
        if (root == null) return root;

        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.val = minValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minValue(TreeNode2 node) {
        int minVal = node.val;
        while (node.left != null) {
            minVal = node.left.val;
            node = node.left;
        }
        return minVal;
    }
}

public class q7 {
    public static void main(String[] args) {
        BinaryTr tree = new BinaryTr();

        tree.root = new TreeNode2(50);
        tree.root.left = new TreeNode2(30);
        tree.root.right = new TreeNode2(70);
        tree.root.left.left = new TreeNode2(20);
        tree.root.left.right = new TreeNode2(40);
        tree.root.right.left = new TreeNode2(60);
        tree.root.right.right = new TreeNode2(80);

        System.out.println("Original Binary Search Tree:");
        printInOrder(tree.root);
        System.out.println();

        int keyToRemove = 30;
        tree.root = tree.deleteNode(tree.root, keyToRemove);

        System.out.println("Binary Search Tree after removing node with value " + keyToRemove + ":");
        printInOrder(tree.root);
    }

    public static void printInOrder(TreeNode2 node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}
