package Java8.Features;
import java.util.function.Supplier;

class Student {
    public Student() {
        System.out.println("Student created");
    }
}
public class CR {
    interface StudentCreator {
        Student create();
    }
    public static void main(String[] args) {
        StudentCreator creator = new StudentCreator() {
            @Override
            public Student create() {
                return new Student();
            }
        };
        Student s = creator.create();
    }
}

class Lambda {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        Student s = supplier.get();
    }
}
class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;
        Student s = supplier.get();
    }
}