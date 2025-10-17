package Threading;

// 1. Runnable-based thread
class MyRunnableThread implements Runnable {
    public void run() {
        System.out.println("Runnable Thread started: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

// 2. Thread class-based thread
class MyExtendedThread extends Thread {
    public void run() {
        System.out.println("Extended Thread started: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Extended: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

// 👇 Combined main method to run both
public class MainThreadDemo {
    public static void main(String[] args) {

        // Runnable approach
        MyRunnableThread runnableObj = new MyRunnableThread();
        Thread thread1 = new Thread(runnableObj);

        // Thread-extended approach
        MyExtendedThread thread2 = new MyExtendedThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
