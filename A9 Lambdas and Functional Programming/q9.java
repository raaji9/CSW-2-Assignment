import java.util.*;

class BoundedBuff<T> {
    private Queue<T> buffer;
    private int capacity;

    public BoundedBuff(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); 
        }
        buffer.offer(item);
        notifyAll(); 
    }

    public synchronized T consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        T item = buffer.poll();
        notifyAll(); 
        return item;
    }
}

public class q9 {
    public static void main(String[] args) {
        BoundedBuff<Integer> buffer = new BoundedBuff<>(5);
        
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = buffer.consume();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
