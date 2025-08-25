package P1;
public class CS1 {
    final public static void main(String[] args) {
        System.out.println("Hi CSD");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);}}}

class Aa{
    public static void main(String[] args) {
        System.out.println("Aa Data");
        CS1.main(new String[]{"Hello","Aj","Atharva"});
    }
}