package Collections;

import java.util.*;
import java.util.*;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

class SortById implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByNameThenId implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare = s1.name.compareTo(s2.name);
        if (nameCompare == 0) {
            return s1.id - s2.id;
        }
        return nameCompare;
    }
}

public class A11 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(20, "AJ"));
        list.add(new Student(10, "ZJ"));
        list.add(new Student(30, "CJ"));
        list.add(new Student(25, "AJ")); // duplicate name

        System.out.println("Original list: " + list);

        Collections.sort(list, new SortById());
        System.out.println("Sorted by id: " + list);

        Collections.sort(list, new SortByName());
        System.out.println("Sorted by name: " + list);

        Collections.sort(list, new SortByNameThenId());
        System.out.println("Sorted by name, then id: " + list);
    }
}

//class Student{
//    String name;
//    double gpa;
//    Student(String name,double gpa){
//        this.name=name;
//        this.gpa=gpa;
//    }
//    public String getName() {
//        return name;
//    }
//    public double getGpa() {
//        return gpa;
//    }
//}
//class StudentComp implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//
//}
//public class A11 {
//    public static void main(String[] args) {
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Charlie", 3.5));
//        students.add(new Student("Bob", 3.7));
//        students.add(new Student("Alice", 3.5));
//        students.add(new Student("Akshit", 3.9));
//        students.sort((o1,o2)->{
//            if (o1.getGpa() - o2.getGpa() > 0) {
//                return 1;
//            } else if (o1.getGpa() - o2.getGpa() < 0) {
//                return -1;
//            }
//            else {
//                return 0;
////                return Integer.compare(o1.getName().length(), o2.getName().length());
//            }
//        });
//        for (Student s : students) {
//            System.out.println(s.getName() + ": " + s.getGpa());
//        }







//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort(comparator);

//    }
//}
