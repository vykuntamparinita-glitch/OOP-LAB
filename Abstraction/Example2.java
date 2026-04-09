
interface Payment {
    void pay(double amount);  // abstract method (by default)
}


class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}


class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}


class Cash implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}


public class Example2 {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new UPI();
        p.pay(500);

        p = new Cash();
        p.pay(200);
    }
}