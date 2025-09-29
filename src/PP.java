import java.io.*;
import java.util.*;
public class PP {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);

        try {
            long a = read.nextLong();
            long b = read.nextLong();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}