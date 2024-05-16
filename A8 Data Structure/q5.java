class TreeN {
    int val;
    TreeN left, right;

    public TreeN(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTre {
    TreeN root;

    public TreeN createTree(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeN node = new TreeN(arr[mid]);

        node.left = createTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;
    }
}

public class q5 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BinaryTre tree = new BinaryTre();
        tree.root = tree.createTree(arr, 0, arr.length - 1);
        System.out.println("Binary Search Tree constructed from the given array : ");
        printInOrder(tree.root);
    }
    public static void printInOrder(TreeN node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val+" ");
        printInOrder(node.right);
    }
}
