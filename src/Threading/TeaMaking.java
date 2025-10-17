package Threading;

class BoilWater extends Thread {
    public void run() {
        System.out.println("Boiling water...");
        try {
            Thread.sleep(5000); // Simulate 5 seconds
        } catch (Exception e) {}
        System.out.println("Water is boiled!");
    }
}

public class TeaMaking {
    public static void main(String[] args) {
        BoilWater t1 = new BoilWater();
        t1.start();

        try {
            t1.join();
            System.out.println("Hello");
        } catch (Exception e) {}

        System.out.println("Now add tea leaves and sugar.");
    }
}
//join() makes the main thread wait until t1 finishes, so the steps happen in the correct order.
