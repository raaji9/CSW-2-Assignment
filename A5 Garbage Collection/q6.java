import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class q6 {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();

        long sTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            objects.add(new byte[1024]);
            if (i % 1000 == 0) {
                long currentTime = System.currentTimeMillis();
                long heapSize = runtime.totalMemory();
                long freeMemory = runtime.freeMemory();
                System.out.println("Timestamp: " + new Date(currentTime) + ", Heap Size: " + heapSize + ", Free Memory: " + freeMemory);
            }
        }

        long eTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (eTime - sTime) + " ms");

        objects = null;

        System.gc();
    }
}