package Java8.Annotations;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// Declaring repeatable annotation type
@Repeatable(Games.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Game {
    String name();
    String day();
}
// Declaring container annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}
// Applying repeating annotations
@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")
public class A6 {
    public static void main(String[] args) {
        // Getting annotations by type
        Game[] games = A6.class.getAnnotationsByType(Game.class);
        for (Game game : games) {    // Iterating values
            System.out.println(game.name() + " on " + game.day());
        }
    }
}

