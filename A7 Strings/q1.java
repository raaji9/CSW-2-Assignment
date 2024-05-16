public class q1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("Using string literals:");
        System.out.println("s1 memory address: " + System.identityHashCode(s1));
        System.out.println("s2 memory address: " + System.identityHashCode(s2));

        System.out.println("\nUsing new keyword:");
        System.out.println("s3 memory address: " + System.identityHashCode(s3));
        System.out.println("s4 memory address: " + System.identityHashCode(s4));

        System.out.println("\nString comparison:");
        System.out.println("Comparing s1 and s2: " + (s1 == s2));
        System.out.println("Comparing s1 and s3: " + (s1 == s3));
        System.out.println("Comparing s3 and s4: " + (s3 == s4));
        System.out.println("Using .equals() method:");
        System.out.println("Comparing s1 and s3: " + s1.equals(s3));
        System.out.println("Comparing s3 and s4: " + s3.equals(s4));
    }
}
