package Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Throws
{
    // Method declares that it may throw IOException
    void readFile() throws IOException
    {
        // Using try-with-resources ensures FileInputStream is closed automatically
        try (FileInputStream fis = new FileInputStream("test.txt"))
        {
            // Read first byte from the file
            int data = fis.read();
            System.out.println("First byte of the file: " + data);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            Throws obj = new Throws();

            // Caller method handles the IOException thrown by readFile()
            obj.readFile();
        }
        catch (IOException e)
        {
            // Exception is caught and handled here
            System.out.println("Exception handled: " + e);
        }
    }
}