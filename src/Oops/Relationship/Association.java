package Oops.Relationship;
class Address
{
    String city = "Delhi";
    String country = "India";
    void displayAddress() {
        System.out.println("City: " + city + ", Country: " + country);}
}
class Student
{
    String name = "Deepak";
    int rollno = 101;
    // Direct reference to another class
    Address address = new Address();
    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
        address.displayAddress();}
}
public class Association
{
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();    }
}
