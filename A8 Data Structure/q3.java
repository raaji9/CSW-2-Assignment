class C {
    String name;
    int population;

    public C(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    C info;
    BNode left;
    BNode right;

    public BNode(C country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(C country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, C country) {
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

    public void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.info.name + ": Population - " + node.info.population);
            inOrderTraversal(node.right);
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        BST bst = new BST();

        C usa = new C("USA", 3280);
        C china = new C("China", 13980);
        C india = new C("India", 136600);
        C brazil = new C("Brazil", 21100);
        C russia = new C("Russia", 145000);

        bst.insert(usa);
        bst.insert(china);
        bst.insert(india);
        bst.insert(brazil);
        bst.insert(russia);

        System.out.println("Ctries in alphabetical order:");
        bst.inOrderTraversal(bst.root);
    }
}
