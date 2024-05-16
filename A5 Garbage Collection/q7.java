public class q7 {
    private String name;
    private int age;
    private String course;

    public q7(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    protected void finalize() {
        System.out.println("q7 " + name + " has been successfully garbage collected.");
    }

    public static void main(String[] args) {
        q7 q71 = new q7("Jon", 20, "Computer Science");
        q7 q72 = new q7("Ali", 22, "Engineering");
        q7 q73 = new q7("Ema", 21, "Mathematics");

        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        System.out.println("Total Memory before: " + totalMemoryBefore);
        System.out.println("Free Memory before: " + freeMemoryBefore);

        q71 = null;
        q72 = null;
        q73 = null;

        System.gc();

        long totalMemoryAfter = runtime.totalMemory();
        long freeMemoryAfter = runtime.freeMemory();
        System.out.println("Total Memory after: " + totalMemoryAfter);
        System.out.println("Free Memory after: " + freeMemoryAfter);
    }
}
