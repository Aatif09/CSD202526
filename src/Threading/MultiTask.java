package Threading;

class MultiTask extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        MultiTask t1 = new MultiTask();
        t1.setName("Worker-1");
        t1.start();

        MultiTask t2 = new MultiTask();
        t2.setName("Worker-2");
        t2.start();

        // Small delay to allow threads to start
        try { Thread.sleep(100); } catch (Exception e) {}

        System.out.println("Active Threads: " + Thread.activeCount());

        System.out.println("Listing all threads:");
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println(t.getName() + "  |  Daemon? " + t.isDaemon());
        }
    }
}
