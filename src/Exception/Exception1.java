package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fs=new FileInputStream("D:/Drivers/javaP/CSD/aab.txt");
        System.out.println("Helloo");
        System.out.println("Hi");
        System.out.println("Bye Helloo");
        System.out.println("Hi");
        System.out.println("Bye Helloo");
        try {
            System.out.println(200/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("ddscHelloo");
        System.out.println("sdcsdHelloo");
        System.out.println("sdcscHelloo");
        System.out.println("ukuiHelloo");
    }
}
