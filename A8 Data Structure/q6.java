class TreeNode1 {
    int val;
    TreeNode1 left, right;

    public TreeNode1(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryT1 {
    TreeNode1 root;

    public boolean isBST(TreeNode1 node, int min, int max) {
        if (node == null) return true;

        if (node.val < min || node.val > max) return false;

        return isBST(node.left, min, node.val - 1) && isBST(node.right, node.val + 1, max);
    }
}

public class q6 {
    public static void main(String[] args) {
        BinaryT1 tree = new BinaryT1();
        boolean isBST = tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Is the tree a BST? " + isBST);
    }
}
