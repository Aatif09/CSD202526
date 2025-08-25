package Oops.Relationship;
class Whiteboard
{
    void writeOnBoard() {
        System.out.println("Writing on the whiteboard...");}
}
class Teacher
{
    void teachLesson() {
        // Local variable: Dependency created inside the method
        Whiteboard board = new Whiteboard();
        board.writeOnBoard();  // Temporary usage
        System.out.println("Teacher is explaining the topic.");}
}
public class Dependency
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher();
        teacher.teachLesson();
    }
}
