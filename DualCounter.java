public class DualCounter {
    private int c1 = 0;
    private int c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void incrementCounter1() throws InterruptedException {
        synchronized (lock1) {
            int a;
            Thread.sleep(150);
            a = c1;
            a++;
            c1 = a;
        }
    }

    public void incrementCounter2() throws InterruptedException {
        synchronized (lock2) {
            int a;
            Thread.sleep(150);
            a = c2;
            a++;
            c2 = a;
        }
    }

    public int valueCounter1() {
        synchronized (lock1) {
            return c1;
        }
    }

    public int valueCounter2() {
        synchronized (lock2) {
            return c2;
        }
    }
}

// public class DualCounter {
//     private int c1 = 0;
//     private int c2 = 0;

//     public synchronized void incrementCounter1() throws InterruptedException {
//             int a;
//             Thread.sleep(150);
//             a = c1;
//             a++;
//             c1 = a;
//     }

//     public synchronized void incrementCounter2() throws InterruptedException {
//             int a;
//             Thread.sleep(150);
//             a = c2;
//             a++;
//             c2 = a;
//     }

//     public synchronized int valueCounter1() {
//             return c1;
//     }

//     public synchronized int valueCounter2() {
//             return c2;
//     }
// }