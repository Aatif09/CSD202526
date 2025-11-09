package Java8.Annotations;
class MathUtils {
    @Deprecated
    int oldAdd(int a, int b) {
        return a + b;
    }
    int newAdd(int a, int b) {
        return a + b;
    }
}
@SuppressWarnings("all")
public class A2 {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        int sum1 = math.oldAdd(2, 3);
        int sum2 = math.newAdd(2, 3);
        System.out.println("Old Add: " + sum1);
        System.out.println("New Add: " + sum2);
    }
}
