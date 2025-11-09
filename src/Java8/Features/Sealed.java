package Java8.Features;

sealed class Payment permits CreditCardPayment, UpiPayment, CashPayment {
    void pay() {
        System.out.println("Payment in progress...");
    }
}
final class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}
sealed class UpiPayment extends Payment permits GooglePay {
    @Override
    void pay() {
        System.out.println("Paid using UPI");
    }
}
final class GooglePay extends UpiPayment {
    @Override
    void pay() {
        System.out.println("Paid using Google Pay");
    }
}
// Because when extending a sealed class, Java forces you to choose one of the three: final, sealed, or non-sealed.
non-sealed class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using Cash");
    }
}
class ForeignCashPayment extends CashPayment {
    @Override
    void pay() {
        System.out.println("Paid using Foreign Cash");
    }
}
public class Sealed {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new GooglePay();
        Payment p3 = new CashPayment();
        Payment p4 = new ForeignCashPayment();

        p1.pay();
        p2.pay();
        p3.pay();
        p4.pay();
    }
}

