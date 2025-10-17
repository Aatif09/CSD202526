package Threading;

class PrintNumbers extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class PrintLetters extends Thread {
    @Override
    public void run() {
        for(char c = 'A'; c <= 'E'; c++) {
            System.out.println(Thread.currentThread().getName() + " - Letter: " + c);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class PrintSymbols extends Thread {
    @Override
    public void run() {
        char[] symbols = {'@', '#', '$', '%', '&'};
        for (char s : symbols) {
            System.out.println(Thread.currentThread().getName() + " - Symbol: " + s);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class MultipleTaskThread {
    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers();
        PrintLetters t2 = new PrintLetters();
        PrintSymbols t3 = new PrintSymbols();

        t1.setName("NumberThread");
        t2.setName("LetterThread");
        t3.setName("SymbolThread");

        t1.start();  // task 1
        t2.start();  // task 2
        t3.start();  // task 3
    }
}

