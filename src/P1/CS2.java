package P1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CS2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New Main");
        Scanner sc=new Scanner(new File("src/P1/aa.txt"));
        System.out.print("Enter Here");
        String data=sc.next();
        System.out.println(data);
    }
}
