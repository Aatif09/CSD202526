package Oops.Relationship;
class Constructor
{
    String name;
    int rollno;

    // Parameterized Constructor
    Constructor(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }

    void display()
    {
        System.out.println("Name: " + name + ", Roll No.: " + rollno);
    }

    public static void main(String[] args)
    {
        Constructor s1 = new Constructor("Deepak", 101); // Passing values
        s1.display();  // Output: Name: Deepak, Roll No.: 101
    }
}