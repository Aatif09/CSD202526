package Oops.Polymorphism;
class A{
    void m1(){
        System.out.println("m1() in A class");
    }
    int m1(int a){
        System.out.println("m1(int) in A class");
        return a;
    }
    public void m1(byte b){
        System.out.println("m1(byte) in A class");
    }
    void m1(int a, String s){
        System.out.println("m1(int, String) in A class");
    }
    void m1(String s, int a){
        System.out.println("m1(String, int) in A class");
    }
}

public class CPoly {

        public static void main(String arg[]){
            A a1 = new A();
            a1.m1();
            a1.m1(10);
            a1.m1((byte)34);
            a1.m1((short)67);
            a1.m1(10,"JTC");
            a1.m1("JTC",2012);
        }
    }


