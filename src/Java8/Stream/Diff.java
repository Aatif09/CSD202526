package Java8.Stream;
import java.util.Arrays;

// Stream in java is a sequence of objects pipelined to produce the desired result.
// it is used to process collection of objects.

public class Diff {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
            System.out.println(sum);

        }
        System.out.println(" ");

        int[] array2 = {1, 2, 3, 4, 5};
        int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);


    }
}
