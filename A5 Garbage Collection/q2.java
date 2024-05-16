public class q2 {

    private String name;

    public q2(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        q2 ob1 = new q2("Object1");
        q2 ob2 = new q2("Object2");

        ob1 = null;
        ob2 = null;

        System.gc();
    }
}