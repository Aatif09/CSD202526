package Java8.Features;

public class OldSwitch {
    public static void main(String[] args) {
        String day = "SATURDAY";
        int numLetters;

        switch (day) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                numLetters = 6;
                break;
            case "TUESDAY":
                numLetters = 7;
                break;
            case "THURSDAY":
            case "SATURDAY":
                numLetters = 8;
                break;
            case "WEDNESDAY":
                numLetters = 9;
                break;
            default:
                numLetters = -1;
        }
        System.out.println(numLetters);
    }
}

