class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class Buyer extends User {
    Buyer(String name, String email) {
        super(name, email);
    }

    void transaction() {
        System.out.println(name + " made a purchase");
    }
}

class Seller extends User {
    Seller(String name, String email) {
        super(name, email);
    }

    void transaction() {
        System.out.println(name + " sold a product");
    }
}

public class Amount {
    public static void main(String[] args) {
        Buyer b = new Buyer("Amit", "amit@gmail.com");
        b.transaction();

        Seller s = new Seller("Neha", "neha@gmail.com");
        s.transaction();
    }
}