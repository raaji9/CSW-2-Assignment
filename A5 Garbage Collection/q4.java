public class q4 {

    private String name;

    public q4(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        new q4("q4");

        System.gc();
    }
}
