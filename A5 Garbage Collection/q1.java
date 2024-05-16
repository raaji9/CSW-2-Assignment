public class q1 {

    private String name;

    public q1(String name) {
        this.name = name;
    }

    public void show() {
        q1 obj = new q1("InnerObject");
        obj.display();
    }

    public void display() {
        new q1("InnerObject").finalize();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        q1 obj = new q1("MainObject");
        obj.show();

        System.gc();
    }
}
