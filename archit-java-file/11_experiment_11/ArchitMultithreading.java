import java.util.LinkedList;
import java.util.Queue;

class Producer extends Thread {
    private final Queue<Integer> buffer;
    private final int maxSize;

    public Producer(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    public void run() {
        int i = 0;
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    try {
                        buffer.wait(); // Wait if the buffer is full
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer produced: " + i);
                buffer.add(i++);
                buffer.notifyAll(); // Notify consumer(s) that data is available

                try {
                    Thread.sleep(1000); // Pause the producer for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer extends Thread {
    private final Queue<Integer> buffer;

    public Consumer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait(); // Wait if the buffer is empty
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int value = buffer.remove();
                System.out.println("Consumer consumed: " + value);
                buffer.notifyAll(); // Notify producer(s) that space is available

                try {
                    Thread.sleep(1000); // Pause the consumer for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ArchitMultithreading {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 5;

        Producer producer = new Producer(buffer, maxSize);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
