package Java8.Features;
import java.util.Arrays;
import java.util.List;
public class MR {
    public static void main(String[] args) {
        MR mr = new MR();
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        numbers.forEach((x)-> System.out.println(x));
//        numbers.forEach(mr::printNumber);
    }
    public void printNumber(Integer n) {
        System.out.println(n);
    }
}
class MR2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "code", "mr");
//        names.forEach(String::toUpperCase);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
//forEach expects a method that takes a String and returns void (Consumer<String>)
//String::toUpperCase takes a String (as the object) and RETURNS a String