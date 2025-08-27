package Oops.Encapsulation;

import java.lang.reflect.Field;

class Empolyee{
    private double salary=1000;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>0) {
            this.salary = salary;
            System.out.println(salary);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
public class Encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Empolyee emp=new Empolyee();
        Field fsalary=Empolyee.class.getDeclaredField("salary");
        fsalary.setAccessible(true);
        System.out.println(fsalary.get(emp));
        emp.getSalary();
        System.out.println();
    }
}
