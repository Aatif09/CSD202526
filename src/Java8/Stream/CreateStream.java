package Java8.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class CreateStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> streamFromList = list.stream();
        System.out.println(streamFromList);

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> streamFromArray = Arrays.stream(array);
        System.out.println(streamFromArray);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 5, 44, 23, 433);
        List<Integer> filteredList = list1.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredList);

        Stream<Integer> streamOfValues = Stream.of(1, 2, 3);
        System.out.println(streamOfValues);

        Stream<Integer> streamIterate = Stream
                .iterate(0, n -> n + 1)
                .limit(10); // prevent infinite loop
        System.out.println(streamIterate);

        Stream<String> streamGenerate = Stream
                .generate(() -> "hello")
                .limit(5);
        System.out.println(streamGenerate);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 5, 44, 23, 433, 0, 1);
        List<Integer> list3 = list2.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(list3);




    }
}

