package Threading;
//Use Runnable when your class already extends another class (Java allows only single inheritance).
//class MyThread implements Runnable {
//    public void run() {
//        System.out.println("Thread is running using Runnable...");
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//       try{
//           Thread.sleep(1000);
//       }catch (Exception e){
//        }
//    }}
//
//    public static void main(String[] args) {
//        MyThread t = new MyThread();          // Create an instance of MyThread
//        Thread thread = new Thread(t);        // Pass it to a Thread object
//        thread.start();                       // Start the thread
//    }
//}

//Use Thread when you are not extending any other class and want a straightforward way to implement threading.
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running using Runnable...");
        for (int i=1;i<=10;i++){
            System.out.println(i);
       try{
           Thread.sleep(1000);
       }catch (Exception e){
        }
    }}

    public static void main(String[] args) {
        MyThread t = new MyThread();   // Create instance of MyThread
        t.start();                     // Start the thread directly
    }
}


class MyThread1 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running using Runnable...");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });

        t.start();
    }
}



