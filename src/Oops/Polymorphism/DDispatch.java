package Oops.Polymorphism;
class Payment {
    void pay() {
        System.out.println("Generic payment");
    }
}
class CreditCard extends Payment {
    void pay() {
        System.out.println("Paid with Credit Card");
    }
}
class PayPal extends Payment {
    void pay() {
        System.out.println("Paid with PayPal");
    }
}
public class DDispatch {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.pay();

        payment = new PayPal();
        payment.pay();
}}
//A Payment reference is used to hold different subclass objects (CreditCard and PayPal).

//The actual method executed depends on the object's runtime type, not the reference type.

