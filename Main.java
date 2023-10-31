public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            try {
                counter.increment();
                System.out.println("Thread 1: " + counter.value());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                counter.increment();
                System.out.println("Thread 2: " + counter.value());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        // DualCounter dualCounter = new DualCounter();

        // Thread thread1 = new Thread(() -> {
        //     try {
        //         dualCounter.incrementCounter1();
        //         System.out.println("Thread 1: " + dualCounter.valueCounter1());
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // Thread thread2 = new Thread(() -> {
        //     try {
        //         dualCounter.incrementCounter2();
        //         System.out.println("Thread 2: " + dualCounter.valueCounter2());
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // thread1.start();
        // thread2.start();
    }
}