import java.util.*;

class BST1 {
    BNode root;

    public BST1() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, Country country) {
        if (node == null) {
            node = new BNode(country);
            return node;
        }

        if (country.name.compareTo(node.info.name) < 0) {
            node.left = insertRec(node.left, country);
        } else if (country.name.compareTo(node.info.name) > 0) {
            node.right = insertRec(node.right, country);
        }

        return node;
    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<BNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BNode node = queue.poll();
            System.out.println(node.info.name + ": Population - " + node.info.population);

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public BNode findMax() {
        return findMaxRec(root);
    }

    private BNode findMaxRec(BNode node) {
        if (node == null || node.right == null) {
            return node;
        }
        return findMaxRec(node.right);
    }

    public BNode findMin() {
        return findMinRec(root);
    }

    private BNode findMinRec(BNode node) {
        if (node == null || node.left == null) {
            return node;
        }
        return findMinRec(node.left);
    }
}

public class q4 {
    public static void main(String[] args) {
        BST1 bst = new BST1();

        bst.insert(new Country("USA", 3280));
        bst.insert(new Country("China", 13980));
        bst.insert(new Country("India", 13660));
        bst.insert(new Country("Brazil", 2110));
        bst.insert(new Country("Russia", 14500));

        System.out.println("Level order traversal:");
        bst.levelOrderTraversal();

        BNode maxNode = bst.findMax();
        System.out.println("Country with maximum population: " + maxNode.info.name + " - Population: " + maxNode.info.population);

        BNode minNode = bst.findMin();
        System.out.println("Country with minimum population: " + minNode.info.name + " - Population: " + minNode.info.population);
    }
}
