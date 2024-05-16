public class q8 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello, CSW2!"));
        thread.start();
    }
}
