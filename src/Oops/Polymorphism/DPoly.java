package Oops.Polymorphism;
class Hello {
    void m1() {
        System.out.println("M1 in Hello");
    }
    public void m2(int a) {
        System.out.println("M2 in Hello");
    }
    private void m3(int a) {
        System.out.println("M2 in Hello");
    }
    static void m4(){
        System.out.println("M4 in Hello");
    }
}
class Hai extends Hello {
    void m1() {
        System.out.println("M1 in Hai");
    }
    public void m2(int a) {
        System.out.println("M2(int a) in Hai");
    }

    public void m3(int a) {
        System.out.println("M2 in Hai");
    }
    static void m4(){
        System.out.println("M4 in Hai");
    }
}
public class DPoly {
    public static void main(String[] args) {
        Hello h1 = new Hai();
        h1.m1();  // This will call the overridden m1() from Hai
        h1.m4();
    }
}

// Static methods are not polymorphic. They're resolved at compile time, based on the reference type.
//m4() in Hai is not an override — it hides the one in Hello. This is known as method hiding.