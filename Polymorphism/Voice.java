
class InvoiceProcessor {

    public void generateInvoice(String customer, double amount) {
        System.out.println("Generating Invoice for " + customer);
        System.out.println("Amount: " + calculate(amount));
    }

    // Private method (hidden logic)
    private double calculate(double amount) {
        return amount + 50; // tax added
    }

    // Public method to access private logic
    public void showFinalAmount(double amount) {
        System.out.println("Final Amount (with tax): " + calculate(amount));
    }
}

class RetailInvoice extends InvoiceProcessor {

    // Overriding method
    @Override
    public void generateInvoice(String customer, double amount) {

        double discount = amount * 0.1;
        double finalAmount = amount - discount;

        System.out.println("Retail Invoice for " + customer);
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

// Main class
public class Voice {
    public static void main(String[] args) {

        // Runtime Polymorphism
        InvoiceProcessor obj = new RetailInvoice();

        obj.generateInvoice("Parinita", 1000);

        System.out.println("-------------");

        // Accessing superclass method
        obj.showFinalAmount(1000);

           }
}