package Threading;

class DownloadTask extends Thread {
    public void run() {
        System.out.println("Download started...");

        for (int i = 1; i <= 100; i++) {
            System.out.println("Downloading " + i + "%");

            try {
                Thread.sleep(100); // Simulate download delay
            } catch (InterruptedException e) {
                System.out.println("Download interrupted! Stopping download...");
                return; // Exit thread
            }
        }

        System.out.println("Download completed!");
    }
}

public class InterruptRealExample {
    public static void main(String[] args) {
        DownloadTask task = new DownloadTask();
        task.start(); // Start the download

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User clicked cancel!");
        task.interrupt(); // Interrupt the download
    }
}

