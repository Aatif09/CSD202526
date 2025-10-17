package Threading;
// Java passes the priority info to the OS.
//The OS (like Windows, Linux, or macOS) has its own thread scheduler.
// That scheduler might not care much about Java priorities.
// It focuses on fairness, load balancing, CPU cores, and other running processes.
class PriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("LowPriorityThread");
        t2.setName("NormalPriorityThread");
        t3.setName("HighPriorityThread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
