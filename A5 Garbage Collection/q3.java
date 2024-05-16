public class q3 {

    private String name;

    public q3(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        q3 ob = new q3("Object");

        ob = null;

        System.gc();
    }
}
