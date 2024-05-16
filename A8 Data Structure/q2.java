class BSTN {
    int info;
    BSTN left;
    BSTN right;

    public BSTN(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    public void insert(int value) {
        if (value < info) {
            if (left == null) {
                left = new BSTN(value);
            } else {
                left.insert(value);
            }
        } else if (value > info) {
            if (right == null) {
                right = new BSTN(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void preOrderTraversal() {
        System.out.print(info + " ");
        if (left != null) left.preOrderTraversal();
        if (right != null) right.preOrderTraversal();
    }

    public void inOrderTraversal() {
        if (left != null) left.inOrderTraversal();
        System.out.print(info + " ");
        if (right != null) right.inOrderTraversal();
    }

    public void postOrderTraversal() {
        if (left != null) left.postOrderTraversal();
        if (right != null) right.postOrderTraversal();
        System.out.print(info + " ");
    }
}

public class q2 {
    public static void main(String[] args) {
        BSTN root = new BSTN(50);
        root.insert(30);
        root.insert(70);
        root.insert(20);
        root.insert(40);
        root.insert(60);
        root.insert(80);

        System.out.println("Pre-order traversal:");
        root.preOrderTraversal();
        System.out.println();

        System.out.println("In-order traversal:");
        root.inOrderTraversal();
        System.out.println();

        System.out.println("Post-order traversal:");
        root.postOrderTraversal();
        System.out.println();
    }
}
