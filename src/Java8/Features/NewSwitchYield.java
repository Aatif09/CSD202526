package Java8.Features;

import java.util.Scanner;

public class NewSwitchYield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLetters;
        while (true) {
            System.out.print("Enter a day: ");
            String day = sc.nextLine().toUpperCase();

            numLetters = switch (day) {
                case "MONDAY", "FRIDAY", "SUNDAY" -> {
                    System.out.println("These days have 6 letters.");
                    yield 6;
                }
                case "TUESDAY" -> 7;
                case "THURSDAY", "SATURDAY" -> {
                    int value = 4 + 4;
                    yield value;
                }
                case "WEDNESDAY" -> {
                    System.out.println("It's Wednesday! Enter a custom value:");
                    int custom = sc.nextInt();
                    sc.nextLine(); // consume leftover newline
                    yield custom;
                }
                default -> {
                    System.out.println("Invalid day, please try again.");
                    yield -1;
                }
            };

            if (numLetters != -1) {
                break;
            }
        }
        System.out.println("Result: " + numLetters);
    }
}
