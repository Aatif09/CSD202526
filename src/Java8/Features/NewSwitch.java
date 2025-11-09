package Java8.Features;
public class NewSwitch {
    public static void main(String[] args) {
        String day = "MONDAY";

        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> -1;
        };

        System.out.println(numLetters);
    }
}
